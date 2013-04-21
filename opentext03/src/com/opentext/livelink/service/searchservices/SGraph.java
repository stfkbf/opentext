
package com.opentext.livelink.service.searchservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SGraph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SGraph">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:SearchServices.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="E" type="{urn:SearchServices.service.livelink.opentext.com}SEdge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="N" type="{urn:SearchServices.service.livelink.opentext.com}SNode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SGraph", propOrder = {
    "e",
    "id",
    "n"
})
public class SGraph
    extends ServiceDataObject
{

    @XmlElement(name = "E")
    protected List<SEdge> e;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "N")
    protected List<SNode> n;

    /**
     * Gets the value of the e property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SEdge }
     * 
     * 
     */
    public List<SEdge> getE() {
        if (e == null) {
            e = new ArrayList<SEdge>();
        }
        return this.e;
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
     * Gets the value of the n property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the n property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SNode }
     * 
     * 
     */
    public List<SNode> getN() {
        if (n == null) {
            n = new ArrayList<SNode>();
        }
        return this.n;
    }

}
