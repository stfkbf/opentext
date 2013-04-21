
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
 *         &lt;element name="dataCollection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldhints" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "dataCollection",
    "fieldhints"
})
@XmlRootElement(name = "GetFieldInfo")
public class GetFieldInfo {

    protected String dataCollection;
    @XmlElement(nillable = true)
    protected List<String> fieldhints;

    /**
     * Gets the value of the dataCollection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCollection() {
        return dataCollection;
    }

    /**
     * Sets the value of the dataCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCollection(String value) {
        this.dataCollection = value;
    }

    /**
     * Gets the value of the fieldhints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldhints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldhints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldhints() {
        if (fieldhints == null) {
            fieldhints = new ArrayList<String>();
        }
        return this.fieldhints;
    }

}
