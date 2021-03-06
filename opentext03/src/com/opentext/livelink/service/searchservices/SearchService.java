
package com.opentext.livelink.service.searchservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b05 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SearchService", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
@XmlSeeAlso({
    com.opentext.ecm.api.ObjectFactory.class,
    com.opentext.livelink.service.searchservices.ObjectFactory.class
})
public interface SearchService {


    /**
     * 
     * @param queries
     * @param partitionName
     * @return
     *     returns com.opentext.livelink.service.searchservices.SingleSearchResponse
     */
    @WebMethod(operationName = "Search", action = "urn:SearchServices.service.livelink.opentext.com/Search")
    @WebResult(name = "SearchResult", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
    @RequestWrapper(localName = "Search", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.Search")
    @ResponseWrapper(localName = "SearchResponse", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.SearchResponse")
    public SingleSearchResponse search(
        @WebParam(name = "queries", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
        SingleSearchRequest queries,
        @WebParam(name = "partitionName", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
        String partitionName);

    /**
     * 
     * @param dataCollection
     * @param fieldhints
     * @return
     *     returns java.util.List<com.opentext.livelink.service.searchservices.FieldInfo>
     */
    @WebMethod(operationName = "GetFieldInfo", action = "urn:SearchServices.service.livelink.opentext.com/GetFieldInfo")
    @WebResult(name = "GetFieldInfoResult", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
    @RequestWrapper(localName = "GetFieldInfo", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.GetFieldInfo")
    @ResponseWrapper(localName = "GetFieldInfoResponse", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.GetFieldInfoResponse")
    public List<FieldInfo> getFieldInfo(
        @WebParam(name = "dataCollection", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
        String dataCollection,
        @WebParam(name = "fieldhints", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
        List<String> fieldhints);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "GetDataCollections", action = "urn:SearchServices.service.livelink.opentext.com/GetDataCollections")
    @WebResult(name = "GetDataCollectionsResult", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
    @RequestWrapper(localName = "GetDataCollections", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.GetDataCollections")
    @ResponseWrapper(localName = "GetDataCollectionsResponse", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.GetDataCollectionsResponse")
    public List<String> getDataCollections();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "GetSupportedQueryLanguages", action = "urn:SearchServices.service.livelink.opentext.com/GetSupportedQueryLanguages")
    @WebResult(name = "GetSupportedQueryLanguagesResult", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
    @RequestWrapper(localName = "GetSupportedQueryLanguages", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.GetSupportedQueryLanguages")
    @ResponseWrapper(localName = "GetSupportedQueryLanguagesResponse", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.GetSupportedQueryLanguagesResponse")
    public List<String> getSupportedQueryLanguages();

    /**
     * 
     * @param queryLanguage
     * @param iso639LanguageCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetQueryLanguageDescription", action = "urn:SearchServices.service.livelink.opentext.com/GetQueryLanguageDescription")
    @WebResult(name = "GetQueryLanguageDescriptionResult", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
    @RequestWrapper(localName = "GetQueryLanguageDescription", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.GetQueryLanguageDescription")
    @ResponseWrapper(localName = "GetQueryLanguageDescriptionResponse", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.GetQueryLanguageDescriptionResponse")
    public String getQueryLanguageDescription(
        @WebParam(name = "iso639LanguageCode", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
        String iso639LanguageCode,
        @WebParam(name = "queryLanguage", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
        String queryLanguage);

    /**
     * 
     * @param queryLanguage
     * @param iso639LanguageCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetResultPageDescription", action = "urn:SearchServices.service.livelink.opentext.com/GetResultPageDescription")
    @WebResult(name = "GetResultPageDescriptionResult", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
    @RequestWrapper(localName = "GetResultPageDescription", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.GetResultPageDescription")
    @ResponseWrapper(localName = "GetResultPageDescriptionResponse", targetNamespace = "urn:SearchServices.service.livelink.opentext.com", className = "com.opentext.livelink.service.searchservices.GetResultPageDescriptionResponse")
    public String getResultPageDescription(
        @WebParam(name = "iso639LanguageCode", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
        String iso639LanguageCode,
        @WebParam(name = "queryLanguage", targetNamespace = "urn:SearchServices.service.livelink.opentext.com")
        String queryLanguage);

}
