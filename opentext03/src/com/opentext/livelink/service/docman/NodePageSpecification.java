
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodePageSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodePageSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:DocMan.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="IncludeHiddenNodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NameFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodePageSpecification", propOrder = {
    "includeHiddenNodes",
    "nameFilter",
    "pageContext",
    "pageNumber",
    "pageSize"
})
public class NodePageSpecification
    extends ServiceDataObject
{

    @XmlElement(name = "IncludeHiddenNodes")
    protected boolean includeHiddenNodes;
    @XmlElement(name = "NameFilter")
    protected String nameFilter;
    @XmlElement(name = "PageContext")
    protected String pageContext;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "PageSize")
    protected int pageSize;

    /**
     * Gets the value of the includeHiddenNodes property.
     * 
     */
    public boolean isIncludeHiddenNodes() {
        return includeHiddenNodes;
    }

    /**
     * Sets the value of the includeHiddenNodes property.
     * 
     */
    public void setIncludeHiddenNodes(boolean value) {
        this.includeHiddenNodes = value;
    }

    /**
     * Gets the value of the nameFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFilter() {
        return nameFilter;
    }

    /**
     * Sets the value of the nameFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFilter(String value) {
        this.nameFilter = value;
    }

    /**
     * Gets the value of the pageContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageContext() {
        return pageContext;
    }

    /**
     * Sets the value of the pageContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageContext(String value) {
        this.pageContext = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

}
