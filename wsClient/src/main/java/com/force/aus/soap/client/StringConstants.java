package com.force.aus.soap.client;

/**
 * Simple interface to hold key values listed in the properties file.
 * Any new property values added to the file should have keys listed in this interface.
 * @author tsellers
 *
 */
public interface StringConstants {

	/**
	 * Name of properties file that will be loaded in the main method.
	 */
	public static final String PROPERTIES_FILENAME = "connection.properties";
	/**
	 * String key for auth endpoint property
	 */
	public static final String AUTH_ENDPOINT_PROPERTY = "authendpoint";
	/**
	 * String key for username property
	 */
	public static final String USERNAME_PROPERTY = "username";
	/**
	 * String key for Password property
	 */
	public static final String PASSWORD_PROPERTY = "pass";

	/**
	 * The name of WSDL file used for generation of stub classes
	 * Should be available on the classpath
	 */
	public static final String WSDL_NAME = "wsdl.path";
	
	public static final String QNAME_NAMESPACE = "qname.namespace";
	
	public static final String QNAME_LOCAL_PART = "qname.local.part";
	
	public static final String XML_OUTPUT_TO_SYSOUT = "xml.output.to.sysout";
}
