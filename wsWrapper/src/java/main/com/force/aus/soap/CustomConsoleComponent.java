
package com.force.aus.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomConsoleComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomConsoleComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AbsoluteHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AbsoluteWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ButtonIconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ButtonStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ButtonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ButtonWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeveloperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsHeightFixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPopoutDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWidthFixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MasterLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelativeHeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RelativeWidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="VisualforcePage" type="{urn:sobject.enterprise.soap.sforce.com}ApexPage" minOccurs="0"/>
 *         &lt;element name="VisualforcePageId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomConsoleComponent", propOrder = {
    "absoluteHeight",
    "absoluteWidth",
    "buttonIconUrl",
    "buttonStyle",
    "buttonText",
    "buttonWidth",
    "createdBy",
    "createdById",
    "createdDate",
    "developerName",
    "isDeleted",
    "isHeightFixed",
    "isHidden",
    "isPopoutDisabled",
    "isWidthFixed",
    "language",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "masterLabel",
    "namespacePrefix",
    "relativeHeight",
    "relativeWidth",
    "systemModstamp",
    "visualforcePage",
    "visualforcePageId"
})
public class CustomConsoleComponent
    extends SObject
{

    @XmlElementRef(name = "AbsoluteHeight", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> absoluteHeight;
    @XmlElementRef(name = "AbsoluteWidth", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> absoluteWidth;
    @XmlElementRef(name = "ButtonIconUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buttonIconUrl;
    @XmlElementRef(name = "ButtonStyle", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buttonStyle;
    @XmlElementRef(name = "ButtonText", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buttonText;
    @XmlElementRef(name = "ButtonWidth", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> buttonWidth;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "DeveloperName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> developerName;
    @XmlElementRef(name = "IsDeleted", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "IsHeightFixed", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isHeightFixed;
    @XmlElementRef(name = "IsHidden", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isHidden;
    @XmlElementRef(name = "IsPopoutDisabled", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPopoutDisabled;
    @XmlElementRef(name = "IsWidthFixed", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isWidthFixed;
    @XmlElementRef(name = "Language", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> language;
    @XmlElementRef(name = "LastModifiedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> lastModifiedBy;
    @XmlElementRef(name = "LastModifiedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastModifiedById;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "MasterLabel", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterLabel;
    @XmlElementRef(name = "NamespacePrefix", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> namespacePrefix;
    @XmlElementRef(name = "RelativeHeight", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> relativeHeight;
    @XmlElementRef(name = "RelativeWidth", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> relativeWidth;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "VisualforcePage", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ApexPage> visualforcePage;
    @XmlElementRef(name = "VisualforcePageId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visualforcePageId;

    /**
     * Gets the value of the absoluteHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAbsoluteHeight() {
        return absoluteHeight;
    }

    /**
     * Sets the value of the absoluteHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAbsoluteHeight(JAXBElement<Integer> value) {
        this.absoluteHeight = value;
    }

    /**
     * Gets the value of the absoluteWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAbsoluteWidth() {
        return absoluteWidth;
    }

    /**
     * Sets the value of the absoluteWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAbsoluteWidth(JAXBElement<Integer> value) {
        this.absoluteWidth = value;
    }

    /**
     * Gets the value of the buttonIconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getButtonIconUrl() {
        return buttonIconUrl;
    }

    /**
     * Sets the value of the buttonIconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setButtonIconUrl(JAXBElement<String> value) {
        this.buttonIconUrl = value;
    }

    /**
     * Gets the value of the buttonStyle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getButtonStyle() {
        return buttonStyle;
    }

    /**
     * Sets the value of the buttonStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setButtonStyle(JAXBElement<String> value) {
        this.buttonStyle = value;
    }

    /**
     * Gets the value of the buttonText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getButtonText() {
        return buttonText;
    }

    /**
     * Sets the value of the buttonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setButtonText(JAXBElement<String> value) {
        this.buttonText = value;
    }

    /**
     * Gets the value of the buttonWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getButtonWidth() {
        return buttonWidth;
    }

    /**
     * Sets the value of the buttonWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setButtonWidth(JAXBElement<Integer> value) {
        this.buttonWidth = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<User> value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdById property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedById(JAXBElement<String> value) {
        this.createdById = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreatedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeveloperName(JAXBElement<String> value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDeleted(JAXBElement<Boolean> value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the isHeightFixed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsHeightFixed() {
        return isHeightFixed;
    }

    /**
     * Sets the value of the isHeightFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsHeightFixed(JAXBElement<Boolean> value) {
        this.isHeightFixed = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsHidden(JAXBElement<Boolean> value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the isPopoutDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPopoutDisabled() {
        return isPopoutDisabled;
    }

    /**
     * Sets the value of the isPopoutDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPopoutDisabled(JAXBElement<Boolean> value) {
        this.isPopoutDisabled = value;
    }

    /**
     * Gets the value of the isWidthFixed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsWidthFixed() {
        return isWidthFixed;
    }

    /**
     * Sets the value of the isWidthFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsWidthFixed(JAXBElement<Boolean> value) {
        this.isWidthFixed = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setLastModifiedBy(JAXBElement<User> value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedById property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the value of the lastModifiedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastModifiedById(JAXBElement<String> value) {
        this.lastModifiedById = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastModifiedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMasterLabel(JAXBElement<String> value) {
        this.masterLabel = value;
    }

    /**
     * Gets the value of the namespacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNamespacePrefix() {
        return namespacePrefix;
    }

    /**
     * Sets the value of the namespacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNamespacePrefix(JAXBElement<String> value) {
        this.namespacePrefix = value;
    }

    /**
     * Gets the value of the relativeHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRelativeHeight() {
        return relativeHeight;
    }

    /**
     * Sets the value of the relativeHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRelativeHeight(JAXBElement<Double> value) {
        this.relativeHeight = value;
    }

    /**
     * Gets the value of the relativeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRelativeWidth() {
        return relativeWidth;
    }

    /**
     * Sets the value of the relativeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRelativeWidth(JAXBElement<Double> value) {
        this.relativeWidth = value;
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

    /**
     * Gets the value of the visualforcePage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApexPage }{@code >}
     *     
     */
    public JAXBElement<ApexPage> getVisualforcePage() {
        return visualforcePage;
    }

    /**
     * Sets the value of the visualforcePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApexPage }{@code >}
     *     
     */
    public void setVisualforcePage(JAXBElement<ApexPage> value) {
        this.visualforcePage = value;
    }

    /**
     * Gets the value of the visualforcePageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisualforcePageId() {
        return visualforcePageId;
    }

    /**
     * Sets the value of the visualforcePageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisualforcePageId(JAXBElement<String> value) {
        this.visualforcePageId = value;
    }

}
