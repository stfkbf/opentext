
package com.opentext.livelink.service.searchservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SResultPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SResultPage">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:SearchServices.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:SearchServices.service.livelink.opentext.com}SGraph" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListDescription" type="{urn:SearchServices.service.livelink.opentext.com}ListDescription" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:SearchServices.service.livelink.opentext.com}DataBagType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SResultPage", propOrder = {
    "item",
    "listDescription",
    "type"
})
public class SResultPage
    extends ServiceDataObject
{

    @XmlElement(name = "Item")
    protected List<SGraph> item;
    @XmlElement(name = "ListDescription")
    protected ListDescription listDescription;
    @XmlElement(name = "Type")
    protected List<DataBagType> type;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SGraph }
     * 
     * 
     */
    public List<SGraph> getItem() {
        if (item == null) {
            item = new ArrayList<SGraph>();
        }
        return this.item;
    }

    /**
     * Gets the value of the listDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ListDescription }
     *     
     */
    public ListDescription getListDescription() {
        return listDescription;
    }

    /**
     * Sets the value of the listDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListDescription }
     *     
     */
    public void setListDescription(ListDescription value) {
        this.listDescription = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataBagType }
     * 
     * 
     */
    public List<DataBagType> getType() {
        if (type == null) {
            type = new ArrayList<DataBagType>();
        }
        return this.type;
    }

}
