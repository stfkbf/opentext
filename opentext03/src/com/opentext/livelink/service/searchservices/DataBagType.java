
package com.opentext.livelink.service.searchservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataBagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataBagType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:SearchServices.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Dates" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ints" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Reals" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Strings" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataBagType", propOrder = {
    "dates",
    "id",
    "ints",
    "reals",
    "strings"
})
public class DataBagType
    extends ServiceDataObject
{

    @XmlElement(name = "Dates")
    protected List<String> dates;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Ints")
    protected List<String> ints;
    @XmlElement(name = "Reals")
    protected List<String> reals;
    @XmlElement(name = "Strings")
    protected List<String> strings;

    /**
     * Gets the value of the dates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDates() {
        if (dates == null) {
            dates = new ArrayList<String>();
        }
        return this.dates;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInts() {
        if (ints == null) {
            ints = new ArrayList<String>();
        }
        return this.ints;
    }

    /**
     * Gets the value of the reals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReals() {
        if (reals == null) {
            reals = new ArrayList<String>();
        }
        return this.reals;
    }

    /**
     * Gets the value of the strings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStrings() {
        if (strings == null) {
            strings = new ArrayList<String>();
        }
        return this.strings;
    }

}
