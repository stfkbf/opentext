
package com.opentext.livelink.service.docman;

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
 *         &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="versionNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "nodeID",
    "versionNum"
})
@XmlRootElement(name = "ListRenditions")
public class ListRenditions {

    protected int nodeID;
    protected int versionNum;

    /**
     * Gets the value of the nodeID property.
     * 
     */
    public int getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     */
    public void setNodeID(int value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the versionNum property.
     * 
     */
    public int getVersionNum() {
        return versionNum;
    }

    /**
     * Sets the value of the versionNum property.
     * 
     */
    public void setVersionNum(int value) {
        this.versionNum = value;
    }

}
