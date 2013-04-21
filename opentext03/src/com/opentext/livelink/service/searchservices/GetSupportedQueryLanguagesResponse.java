
package com.opentext.livelink.service.searchservices;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="GetSupportedQueryLanguagesResult" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "getSupportedQueryLanguagesResult"
})
@XmlRootElement(name = "GetSupportedQueryLanguagesResponse")
public class GetSupportedQueryLanguagesResponse {

    @XmlElement(name = "GetSupportedQueryLanguagesResult", nillable = true)
    protected List<String> getSupportedQueryLanguagesResult;

    /**
     * Gets the value of the getSupportedQueryLanguagesResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getSupportedQueryLanguagesResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetSupportedQueryLanguagesResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGetSupportedQueryLanguagesResult() {
        if (getSupportedQueryLanguagesResult == null) {
            getSupportedQueryLanguagesResult = new ArrayList<String>();
        }
        return this.getSupportedQueryLanguagesResult;
    }

}
