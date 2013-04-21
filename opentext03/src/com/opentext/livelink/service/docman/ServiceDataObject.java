
package com.opentext.livelink.service.docman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDataObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDataObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDataObject")
@XmlSeeAlso({
    Node.class,
    Version.class,
    Metadata.class,
    AttributeGroup.class,
    NodeRightUpdateInfo.class,
    NodeRights.class,
    AttributeGroupDefinition.class,
    NodePageResult.class,
    NodePageSpecification.class,
    NodeRight.class,
    CompoundDocRelease.class,
    MoveOptions.class,
    NodePosition.class,
    CategoryItemsUpgradeInfo.class,
    CopyOptions.class,
    PagedNodeAuditData.class,
    NodeAuditRecord.class,
    NodeFeature.class,
    NodeContainerInfo.class,
    NodeVersionInfo.class,
    NodeReferenceInfo.class,
    NodePermissions.class,
    NodeReservationInfo.class,
    Attribute.class
})
public abstract class ServiceDataObject {


}
