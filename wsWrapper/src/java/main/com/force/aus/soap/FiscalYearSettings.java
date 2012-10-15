
package com.force.aus.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FiscalYearSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiscalYearSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IsStandardYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PeriodLabelScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periods" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="QuarterLabelScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuarterPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="WeekLabelScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeekStartDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="YearType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiscalYearSettings", propOrder = {
    "description",
    "endDate",
    "isStandardYear",
    "name",
    "periodId",
    "periodLabelScheme",
    "periodPrefix",
    "periods",
    "quarterLabelScheme",
    "quarterPrefix",
    "startDate",
    "systemModstamp",
    "weekLabelScheme",
    "weekStartDay",
    "yearType"
})
public class FiscalYearSettings
    extends SObject
{

    @XmlElementRef(name = "Description", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EndDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "IsStandardYear", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isStandardYear;
    @XmlElementRef(name = "Name", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "PeriodId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> periodId;
    @XmlElementRef(name = "PeriodLabelScheme", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> periodLabelScheme;
    @XmlElementRef(name = "PeriodPrefix", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> periodPrefix;
    @XmlElementRef(name = "Periods", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> periods;
    @XmlElementRef(name = "QuarterLabelScheme", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quarterLabelScheme;
    @XmlElementRef(name = "QuarterPrefix", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quarterPrefix;
    @XmlElementRef(name = "StartDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "WeekLabelScheme", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> weekLabelScheme;
    @XmlElementRef(name = "WeekStartDay", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> weekStartDay;
    @XmlElementRef(name = "YearType", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> yearType;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the isStandardYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsStandardYear() {
        return isStandardYear;
    }

    /**
     * Sets the value of the isStandardYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsStandardYear(JAXBElement<Boolean> value) {
        this.isStandardYear = value;
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
     * Gets the value of the periodId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPeriodId() {
        return periodId;
    }

    /**
     * Sets the value of the periodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPeriodId(JAXBElement<String> value) {
        this.periodId = value;
    }

    /**
     * Gets the value of the periodLabelScheme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPeriodLabelScheme() {
        return periodLabelScheme;
    }

    /**
     * Sets the value of the periodLabelScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPeriodLabelScheme(JAXBElement<String> value) {
        this.periodLabelScheme = value;
    }

    /**
     * Gets the value of the periodPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPeriodPrefix() {
        return periodPrefix;
    }

    /**
     * Sets the value of the periodPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPeriodPrefix(JAXBElement<String> value) {
        this.periodPrefix = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getPeriods() {
        return periods;
    }

    /**
     * Sets the value of the periods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setPeriods(JAXBElement<QueryResultType> value) {
        this.periods = value;
    }

    /**
     * Gets the value of the quarterLabelScheme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuarterLabelScheme() {
        return quarterLabelScheme;
    }

    /**
     * Sets the value of the quarterLabelScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuarterLabelScheme(JAXBElement<String> value) {
        this.quarterLabelScheme = value;
    }

    /**
     * Gets the value of the quarterPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuarterPrefix() {
        return quarterPrefix;
    }

    /**
     * Sets the value of the quarterPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuarterPrefix(JAXBElement<String> value) {
        this.quarterPrefix = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = value;
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
     * Gets the value of the weekLabelScheme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWeekLabelScheme() {
        return weekLabelScheme;
    }

    /**
     * Sets the value of the weekLabelScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWeekLabelScheme(JAXBElement<String> value) {
        this.weekLabelScheme = value;
    }

    /**
     * Gets the value of the weekStartDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWeekStartDay() {
        return weekStartDay;
    }

    /**
     * Sets the value of the weekStartDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWeekStartDay(JAXBElement<Integer> value) {
        this.weekStartDay = value;
    }

    /**
     * Gets the value of the yearType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYearType() {
        return yearType;
    }

    /**
     * Sets the value of the yearType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYearType(JAXBElement<String> value) {
        this.yearType = value;
    }

}
