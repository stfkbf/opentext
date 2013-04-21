
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="parentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="partialData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "parentID",
    "partialData"
})
@XmlRootElement(name = "ListNodes")
public class ListNodes {

    protected int parentID;
    protected boolean partialData;

    /**
     * Gets the value of the parentID property.
     * 
     */
    public int getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     */
    public void setParentID(int value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the partialData property.
     * 
     */
    public boolean isPartialData() {
        return partialData;
    }

    /**
     * Sets the value of the partialData property.
     * 
     */
    public void setPartialData(boolean value) {
        this.partialData = value;
    }

}
