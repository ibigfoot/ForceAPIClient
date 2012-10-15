
package com.force.aus.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allOrNone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allOrNone"
})
@XmlRootElement(name = "AllOrNoneHeader", namespace = "urn:enterprise.soap.sforce.com")
public class AllOrNoneHeader {

    @XmlElement(namespace = "urn:enterprise.soap.sforce.com")
    protected boolean allOrNone;

    /**
     * Gets the value of the allOrNone property.
     * 
     */
    public boolean isAllOrNone() {
        return allOrNone;
    }

    /**
     * Sets the value of the allOrNone property.
     * 
     */
    public void setAllOrNone(boolean value) {
        this.allOrNone = value;
    }

}
