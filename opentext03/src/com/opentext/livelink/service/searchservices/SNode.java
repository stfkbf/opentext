
package com.opentext.livelink.service.searchservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SNode">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:SearchServices.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="I" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="S" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SNode", propOrder = {
    "d",
    "i",
    "id",
    "r",
    "s",
    "type"
})
public class SNode
    extends ServiceDataObject
{

    @XmlElement(name = "D")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> d;
    @XmlElement(name = "I", type = Integer.class)
    protected List<Integer> i;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "R", type = Double.class)
    protected List<Double> r;
    @XmlElement(name = "S")
    protected List<String> s;
    @XmlElement(name = "Type")
    protected String type;

    /**
     * Gets the value of the d property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getD() {
        if (d == null) {
            d = new ArrayList<XMLGregorianCalendar>();
        }
        return this.d;
    }

    /**
     * Gets the value of the i property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the i property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getI() {
        if (i == null) {
            i = new ArrayList<Integer>();
        }
        return this.i;
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
     * Gets the value of the r property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getR() {
        if (r == null) {
            r = new ArrayList<Double>();
        }
        return this.r;
    }

    /**
     * Gets the value of the s property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the s property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getS() {
        if (s == null) {
            s = new ArrayList<String>();
        }
        return this.s;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
