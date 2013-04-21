
package com.opentext.livelink.service.searchservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:SearchServices.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="ActualCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IncludeCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ListHead" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListDescription", propOrder = {
    "actualCount",
    "includeCount",
    "listHead"
})
public class ListDescription
    extends ServiceDataObject
{

    @XmlElement(name = "ActualCount")
    protected int actualCount;
    @XmlElement(name = "IncludeCount")
    protected int includeCount;
    @XmlElement(name = "ListHead")
    protected int listHead;

    /**
     * Gets the value of the actualCount property.
     * 
     */
    public int getActualCount() {
        return actualCount;
    }

    /**
     * Sets the value of the actualCount property.
     * 
     */
    public void setActualCount(int value) {
        this.actualCount = value;
    }

    /**
     * Gets the value of the includeCount property.
     * 
     */
    public int getIncludeCount() {
        return includeCount;
    }

    /**
     * Sets the value of the includeCount property.
     * 
     */
    public void setIncludeCount(int value) {
        this.includeCount = value;
    }

    /**
     * Gets the value of the listHead property.
     * 
     */
    public int getListHead() {
        return listHead;
    }

    /**
     * Sets the value of the listHead property.
     * 
     */
    public void setListHead(int value) {
        this.listHead = value;
    }

}
