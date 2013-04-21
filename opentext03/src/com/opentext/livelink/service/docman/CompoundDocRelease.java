
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CompoundDocRelease complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompoundDocRelease">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompoundDocID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Locked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LockedBy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LockedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Minor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundDocRelease", propOrder = {
    "comment",
    "compoundDocID",
    "locked",
    "lockedBy",
    "lockedDate",
    "major",
    "minor",
    "name",
    "releaseID"
})
public class CompoundDocRelease
    extends ServiceDataObject
{

    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "CompoundDocID")
    protected int compoundDocID;
    @XmlElement(name = "Locked")
    protected int locked;
    @XmlElement(name = "LockedBy")
    protected int lockedBy;
    @XmlElement(name = "LockedDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lockedDate;
    @XmlElement(name = "Major")
    protected int major;
    @XmlElement(name = "Minor")
    protected int minor;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ReleaseID")
    protected int releaseID;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the compoundDocID property.
     * 
     */
    public int getCompoundDocID() {
        return compoundDocID;
    }

    /**
     * Sets the value of the compoundDocID property.
     * 
     */
    public void setCompoundDocID(int value) {
        this.compoundDocID = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     */
    public int getLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     */
    public void setLocked(int value) {
        this.locked = value;
    }

    /**
     * Gets the value of the lockedBy property.
     * 
     */
    public int getLockedBy() {
        return lockedBy;
    }

    /**
     * Sets the value of the lockedBy property.
     * 
     */
    public void setLockedBy(int value) {
        this.lockedBy = value;
    }

    /**
     * Gets the value of the lockedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLockedDate() {
        return lockedDate;
    }

    /**
     * Sets the value of the lockedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLockedDate(XMLGregorianCalendar value) {
        this.lockedDate = value;
    }

    /**
     * Gets the value of the major property.
     * 
     */
    public int getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * Gets the value of the minor property.
     * 
     */
    public int getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     */
    public void setMinor(int value) {
        this.minor = value;
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
     * Gets the value of the releaseID property.
     * 
     */
    public int getReleaseID() {
        return releaseID;
    }

    /**
     * Sets the value of the releaseID property.
     * 
     */
    public void setReleaseID(int value) {
        this.releaseID = value;
    }

}
