
package com.opentext.livelink.service.searchservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SingleSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleSearchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:SearchServices.service.livelink.opentext.com}ServiceDataObject">
 *       &lt;sequence>
 *         &lt;element name="DataCollectionSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstResultToRetrieve" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumResultsToRetrieve" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QueryLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultOrderSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultSetSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultTransformationSpec" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleSearchRequest", propOrder = {
    "dataCollectionSpec",
    "firstResultToRetrieve",
    "numResultsToRetrieve",
    "queryLanguage",
    "resultOrderSpec",
    "resultSetSpec",
    "resultTransformationSpec"
})
public class SingleSearchRequest
    extends ServiceDataObject
{

    @XmlElement(name = "DataCollectionSpec")
    protected String dataCollectionSpec;
    @XmlElement(name = "FirstResultToRetrieve")
    protected int firstResultToRetrieve;
    @XmlElement(name = "NumResultsToRetrieve")
    protected int numResultsToRetrieve;
    @XmlElement(name = "QueryLanguage")
    protected String queryLanguage;
    @XmlElement(name = "ResultOrderSpec")
    protected String resultOrderSpec;
    @XmlElement(name = "ResultSetSpec")
    protected String resultSetSpec;
    @XmlElement(name = "ResultTransformationSpec")
    protected List<String> resultTransformationSpec;

    /**
     * Gets the value of the dataCollectionSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCollectionSpec() {
        return dataCollectionSpec;
    }

    /**
     * Sets the value of the dataCollectionSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCollectionSpec(String value) {
        this.dataCollectionSpec = value;
    }

    /**
     * Gets the value of the firstResultToRetrieve property.
     * 
     */
    public int getFirstResultToRetrieve() {
        return firstResultToRetrieve;
    }

    /**
     * Sets the value of the firstResultToRetrieve property.
     * 
     */
    public void setFirstResultToRetrieve(int value) {
        this.firstResultToRetrieve = value;
    }

    /**
     * Gets the value of the numResultsToRetrieve property.
     * 
     */
    public int getNumResultsToRetrieve() {
        return numResultsToRetrieve;
    }

    /**
     * Sets the value of the numResultsToRetrieve property.
     * 
     */
    public void setNumResultsToRetrieve(int value) {
        this.numResultsToRetrieve = value;
    }

    /**
     * Gets the value of the queryLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryLanguage() {
        return queryLanguage;
    }

    /**
     * Sets the value of the queryLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryLanguage(String value) {
        this.queryLanguage = value;
    }

    /**
     * Gets the value of the resultOrderSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultOrderSpec() {
        return resultOrderSpec;
    }

    /**
     * Sets the value of the resultOrderSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultOrderSpec(String value) {
        this.resultOrderSpec = value;
    }

    /**
     * Gets the value of the resultSetSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultSetSpec() {
        return resultSetSpec;
    }

    /**
     * Sets the value of the resultSetSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultSetSpec(String value) {
        this.resultSetSpec = value;
    }

    /**
     * Gets the value of the resultTransformationSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultTransformationSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultTransformationSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResultTransformationSpec() {
        if (resultTransformationSpec == null) {
            resultTransformationSpec = new ArrayList<String>();
        }
        return this.resultTransformationSpec;
    }

}
