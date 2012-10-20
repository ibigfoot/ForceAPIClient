package com.force.aus.soap.client;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.force.aus.soap.DescribeGlobal;
import com.force.aus.soap.DescribeGlobalResponse;
import com.force.aus.soap.DescribeGlobalResultType;
import com.force.aus.soap.DescribeGlobalSObjectResultType;
import com.force.aus.soap.Login;
import com.force.aus.soap.LoginResponse;
import com.force.aus.soap.LoginResultType;
import com.force.aus.soap.Logout;
import com.force.aus.soap.SessionHeader;
import com.force.aus.soap.SforceService;
import com.force.aus.soap.Soap;
import com.sun.xml.bind.api.JAXBRIContext;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;
import com.sun.xml.ws.transport.http.client.HttpTransportPipe;


public class EnterpriseClient {

	private static Properties props;
	
	public static void main (String[] args) {
		EnterpriseClient client = new EnterpriseClient();
		try {
			props = new Properties();
			InputStream in = client.getClass().getClassLoader().getResourceAsStream(StringConstants.PROPERTIES_FILENAME);
			props.load(in);
			in.close();
			client.run();

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
	
	public void run() throws Exception {
		
		System.out.println("running");
		Iterator<Object> it = props.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println("Props ["+key+"] -> ["+props.getProperty(key)+"]");
		}
		
		
		URL url = this.getClass().getResource(props.getProperty(StringConstants.WSDL_NAME));
		if (url == null) {
			throw new RuntimeException("Unable to find WSDL ["+props.getProperty(StringConstants.WSDL_NAME)+"] on classpath");
		}
		SforceService service = new SforceService(url, new QName(props.getProperty(StringConstants.QNAME_NAMESPACE), 
													props.getProperty(StringConstants.QNAME_LOCAL_PART)));
		
		Soap port = service.getSoap();
		
		JAXBContext jaxbContext = JAXBContext.newInstance("com.force.aus.soap");
	
		Login login = new Login();
		login.setPassword(props.getProperty(StringConstants.PASSWORD_PROPERTY));
		login.setUsername(props.getProperty(StringConstants.USERNAME_PROPERTY));
		
		HttpTransportPipe.dump = Boolean.valueOf(props.getProperty(StringConstants.XML_OUTPUT_TO_SYSOUT));
		
		LoginResponse response = port.login(login);
		
		LoginResultType result = response.getResult();
		System.out.println("Session ID ["+result.getSessionId()+"]");
		System.out.println("Service URL ["+result.getServerUrl()+"]");

		WSBindingProvider wsBindingProvider = (WSBindingProvider) port;
		
		Map<String, Object> requestContext = wsBindingProvider.getRequestContext();
		requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, result.getServerUrl());

		Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();
		httpHeaders.put("Content-Encoding", Collections.singletonList("gzip"));
		httpHeaders.put("Accept-Encoding", Collections.singletonList("gzip"));
		
		
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
		
		List<Header> headers = new ArrayList<Header>();
		
		SessionHeader sessionHeader = new SessionHeader();
		sessionHeader.setSessionId(result.getSessionId());
		
		headers.add(Headers.create((JAXBRIContext)jaxbContext, sessionHeader));
		
		wsBindingProvider.setOutboundHeaders(headers);
		
		DescribeGlobalResponse describeGlobalResponse = port.describeGlobal(new DescribeGlobal());
		
		DescribeGlobalResultType describeGlobalResultType = describeGlobalResponse.getResult();
		for(DescribeGlobalSObjectResultType type : describeGlobalResultType.getSobjects()) {
			System.out.println("Object -------- ["+type.getName()+"]");
		}
		port.logout(new Logout());
	}
}
