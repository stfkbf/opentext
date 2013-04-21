
package com.opentext.livelink.service.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.opentext.livelink.service.core package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContextID_QNAME = new QName("urn:Core.service.livelink.opentext.com", "contextID");
    private final static QName _FileAtts_QNAME = new QName("urn:Core.service.livelink.opentext.com", "fileAtts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.opentext.livelink.service.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DownloadContent }
     * 
     */
    public DownloadContent createDownloadContent() {
        return new DownloadContent();
    }

    /**
     * Create an instance of {@link UploadContentResponse }
     * 
     */
    public UploadContentResponse createUploadContentResponse() {
        return new UploadContentResponse();
    }

    /**
     * Create an instance of {@link FileAtts }
     * 
     */
    public FileAtts createFileAtts() {
        return new FileAtts();
    }

    /**
     * Create an instance of {@link UploadContent }
     * 
     */
    public UploadContent createUploadContent() {
        return new UploadContent();
    }

    /**
     * Create an instance of {@link DownloadContentResponse }
     * 
     */
    public DownloadContentResponse createDownloadContentResponse() {
        return new DownloadContentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Core.service.livelink.opentext.com", name = "contextID")
    public JAXBElement<String> createContextID(String value) {
        return new JAXBElement<String>(_ContextID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileAtts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:Core.service.livelink.opentext.com", name = "fileAtts")
    public JAXBElement<FileAtts> createFileAtts(FileAtts value) {
        return new JAXBElement<FileAtts>(_FileAtts_QNAME, FileAtts.class, null, value);
    }

}
