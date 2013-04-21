
package com.opentext.livelink.service.searchservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:SearchServices.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Collection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnEdge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OnNode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Retrievable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Searchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StorageModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XD" type="{urn:SearchServices.service.livelink.opentext.com}NV" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldInfo", propOrder = {
    "collection",
    "name",
    "onEdge",
    "onNode",
    "retrievable",
    "searchable",
    "storageModel",
    "type",
    "xd"
})
public class FieldInfo
    extends ServiceDataObject
{

    @XmlElement(name = "Collection")
    protected String collection;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "OnEdge")
    protected boolean onEdge;
    @XmlElement(name = "OnNode")
    protected boolean onNode;
    @XmlElement(name = "Retrievable")
    protected boolean retrievable;
    @XmlElement(name = "Searchable")
    protected boolean searchable;
    @XmlElement(name = "StorageModel")
    protected String storageModel;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "XD")
    protected List<NV> xd;

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollection(String value) {
        this.collection = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the onEdge property.
     * 
     */
    public boolean isOnEdge() {
        return onEdge;
    }

    /**
     * Sets the value of the onEdge property.
     * 
     */
    public void setOnEdge(boolean value) {
        this.onEdge = value;
    }

    /**
     * Gets the value of the onNode property.
     * 
     */
    public boolean isOnNode() {
        return onNode;
    }

    /**
     * Sets the value of the onNode property.
     * 
     */
    public void setOnNode(boolean value) {
        this.onNode = value;
    }

    /**
     * Gets the value of the retrievable property.
     * 
     */
    public boolean isRetrievable() {
        return retrievable;
    }

    /**
     * Sets the value of the retrievable property.
     * 
     */
    public void setRetrievable(boolean value) {
        this.retrievable = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     */
    public boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     */
    public void setSearchable(boolean value) {
        this.searchable = value;
    }

    /**
     * Gets the value of the storageModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageModel() {
        return storageModel;
    }

    /**
     * Sets the value of the storageModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageModel(String value) {
        this.storageModel = value;
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

    /**
     * Gets the value of the xd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NV }
     * 
     * 
     */
    public List<NV> getXD() {
        if (xd == null) {
            xd = new ArrayList<NV>();
        }
        return this.xd;
    }

}
