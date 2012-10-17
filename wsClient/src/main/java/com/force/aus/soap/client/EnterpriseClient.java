package com.force.aus.soap.client;

import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;

import javax.xml.namespace.QName;

import com.force.aus.soap.Login;
import com.force.aus.soap.LoginResponse;
import com.force.aus.soap.LoginResultType;
import com.force.aus.soap.SforceService;
import com.force.aus.soap.Soap;

public class EnterpriseClient {

	private static Properties props;
	
	public static void main (String[] args) {
		EnterpriseClient client = new EnterpriseClient();
		try {
			props = new Properties();
			InputStream in = client.getClass().getClassLoader().getResourceAsStream(PropertyStrings.PROPERTIES_FILENAME);
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
		
		
		URL url = this.getClass().getResource(props.getProperty(PropertyStrings.WSDL_NAME));
		if (url == null) {
			throw new RuntimeException("Unable to find WSDL ["+props.getProperty(PropertyStrings.WSDL_NAME)+"] on classpath");
		}
		SforceService service = new SforceService(url, new QName(props.getProperty(PropertyStrings.QNAME_NAMESPACE), 
													props.getProperty(PropertyStrings.QNAME_LOCAL_PART)));
		
		Soap port = service.getSoap();
		
		Login login = new Login();
		login.setPassword(props.getProperty(PropertyStrings.PASSWORD_PROPERTY));
		login.setUsername(props.getProperty(PropertyStrings.USERNAME_PROPERTY));
		
		LoginResponse response = port.login(login);
		
		LoginResultType result = response.getResult();
		System.out.println("Session ID ["+result.getSessionId()+"]");
		
	}
}
