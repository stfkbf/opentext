
package com.opentext.livelink.service.searchservices;

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
 *         &lt;element name="iso639LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "iso639LanguageCode",
    "queryLanguage"
})
@XmlRootElement(name = "GetResultPageDescription")
public class GetResultPageDescription {

    protected String iso639LanguageCode;
    protected String queryLanguage;

    /**
     * Gets the value of the iso639LanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso639LanguageCode() {
        return iso639LanguageCode;
    }

    /**
     * Sets the value of the iso639LanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso639LanguageCode(String value) {
        this.iso639LanguageCode = value;
    }

    /**
     * Gets the value of the queryLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryLanguage() {
        return queryLanguage;
    }

    /**
     * Sets the value of the queryLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryLanguage(String value) {
        this.queryLanguage = value;
    }

}
