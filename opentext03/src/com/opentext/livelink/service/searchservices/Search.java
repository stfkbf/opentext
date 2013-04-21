
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
 *         &lt;element name="queries" type="{urn:SearchServices.service.livelink.opentext.com}SingleSearchRequest" minOccurs="0"/>
 *         &lt;element name="partitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "queries",
    "partitionName"
})
@XmlRootElement(name = "Search")
public class Search {

    protected SingleSearchRequest queries;
    protected String partitionName;

    /**
     * Gets the value of the queries property.
     * 
     * @return
     *     possible object is
     *     {@link SingleSearchRequest }
     *     
     */
    public SingleSearchRequest getQueries() {
        return queries;
    }

    /**
     * Sets the value of the queries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleSearchRequest }
     *     
     */
    public void setQueries(SingleSearchRequest value) {
        this.queries = value;
    }

    /**
     * Gets the value of the partitionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * Sets the value of the partitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionName(String value) {
        this.partitionName = value;
    }

}
