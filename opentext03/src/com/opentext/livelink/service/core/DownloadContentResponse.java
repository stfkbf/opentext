
package com.opentext.livelink.service.core;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
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
 *         &lt;element name="DownloadContentResult" type="{http://schemas.microsoft.com/Message}StreamBody"/>
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
    "downloadContentResult"
})
@XmlRootElement(name = "DownloadContentResponse")
public class DownloadContentResponse {

    @XmlElement(name = "DownloadContentResult", required = true)
    @XmlMimeType("*/*")
    protected DataHandler downloadContentResult;

    /**
     * Gets the value of the downloadContentResult property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getDownloadContentResult() {
        return downloadContentResult;
    }

    /**
     * Sets the value of the downloadContentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setDownloadContentResult(DataHandler value) {
        this.downloadContentResult = value;
    }

}
