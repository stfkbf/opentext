
package com.opentext.livelink.service.core;

import javax.xml.bind.annotation.XmlRegistry;


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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.opentext.livelink.service.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link ChunkedOperationContext }
     * 
     */
    public ChunkedOperationContext createChunkedOperationContext() {
        return new ChunkedOperationContext();
    }

    /**
     * Create an instance of {@link PageHandle }
     * 
     */
    public PageHandle createPageHandle() {
        return new PageHandle();
    }

    /**
     * Create an instance of {@link IntegerValue }
     * 
     */
    public IntegerValue createIntegerValue() {
        return new IntegerValue();
    }

    /**
     * Create an instance of {@link RowValue }
     * 
     */
    public RowValue createRowValue() {
        return new RowValue();
    }

    /**
     * Create an instance of {@link PrimitiveValue }
     * 
     */
    public PrimitiveValue createPrimitiveValue() {
        return new PrimitiveValue();
    }

    /**
     * Create an instance of {@link RealValue }
     * 
     */
    public RealValue createRealValue() {
        return new RealValue();
    }

    /**
     * Create an instance of {@link StringValue }
     * 
     */
    public StringValue createStringValue() {
        return new StringValue();
    }

    /**
     * Create an instance of {@link BooleanValue }
     * 
     */
    public BooleanValue createBooleanValue() {
        return new BooleanValue();
    }

    /**
     * Create an instance of {@link TableValue }
     * 
     */
    public TableValue createTableValue() {
        return new TableValue();
    }

    /**
     * Create an instance of {@link DateValue }
     * 
     */
    public DateValue createDateValue() {
        return new DateValue();
    }

    /**
     * Create an instance of {@link DataValue }
     * 
     */
    public DataValue createDataValue() {
        return new DataValue();
    }

}
