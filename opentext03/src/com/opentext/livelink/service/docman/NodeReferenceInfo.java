
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeReferenceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeReferenceInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="OriginalID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OriginalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VersionNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeReferenceInfo", propOrder = {
    "originalID",
    "originalType",
    "versionNum"
})
public class NodeReferenceInfo
    extends ServiceDataObject
{

    @XmlElement(name = "OriginalID")
    protected int originalID;
    @XmlElement(name = "OriginalType")
    protected String originalType;
    @XmlElement(name = "VersionNum", required = true, type = Integer.class, nillable = true)
    protected Integer versionNum;

    /**
     * Gets the value of the originalID property.
     * 
     */
    public int getOriginalID() {
        return originalID;
    }

    /**
     * Sets the value of the originalID property.
     * 
     */
    public void setOriginalID(int value) {
        this.originalID = value;
    }

    /**
     * Gets the value of the originalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalType() {
        return originalType;
    }

    /**
     * Sets the value of the originalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalType(String value) {
        this.originalType = value;
    }

    /**
     * Gets the value of the versionNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersionNum() {
        return versionNum;
    }

    /**
     * Sets the value of the versionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersionNum(Integer value) {
        this.versionNum = value;
    }

}
