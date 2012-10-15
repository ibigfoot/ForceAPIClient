
package com.force.aus.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserLicense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserLicense">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="LicenseDefinitionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonthlyLoginsEntitlement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MonthlyLoginsUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserLicense", propOrder = {
    "licenseDefinitionKey",
    "monthlyLoginsEntitlement",
    "monthlyLoginsUsed",
    "name",
    "systemModstamp"
})
public class UserLicense
    extends SObject
{

    @XmlElementRef(name = "LicenseDefinitionKey", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenseDefinitionKey;
    @XmlElementRef(name = "MonthlyLoginsEntitlement", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> monthlyLoginsEntitlement;
    @XmlElementRef(name = "MonthlyLoginsUsed", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> monthlyLoginsUsed;
    @XmlElementRef(name = "Name", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;

    /**
     * Gets the value of the licenseDefinitionKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseDefinitionKey() {
        return licenseDefinitionKey;
    }

    /**
     * Sets the value of the licenseDefinitionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseDefinitionKey(JAXBElement<String> value) {
        this.licenseDefinitionKey = value;
    }

    /**
     * Gets the value of the monthlyLoginsEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMonthlyLoginsEntitlement() {
        return monthlyLoginsEntitlement;
    }

    /**
     * Sets the value of the monthlyLoginsEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMonthlyLoginsEntitlement(JAXBElement<Integer> value) {
        this.monthlyLoginsEntitlement = value;
    }

    /**
     * Gets the value of the monthlyLoginsUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMonthlyLoginsUsed() {
        return monthlyLoginsUsed;
    }

    /**
     * Sets the value of the monthlyLoginsUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMonthlyLoginsUsed(JAXBElement<Integer> value) {
        this.monthlyLoginsUsed = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the systemModstamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the value of the systemModstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSystemModstamp(JAXBElement<XMLGregorianCalendar> value) {
        this.systemModstamp = value;
    }

}
