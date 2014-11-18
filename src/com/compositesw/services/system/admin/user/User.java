/*******************************************************************************
* Copyright (c) 2014 Cisco Systems
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* PDTool project commiters - initial release
*******************************************************************************/

package com.compositesw.services.system.admin.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="explicitRights" type="{http://www.compositesw.com/services/system/admin/user}userRightsList"/>
 *         &lt;element name="effectiveRights" type="{http://www.compositesw.com/services/system/admin/user}userRightsList"/>
 *         &lt;element name="inheritedRights" type="{http://www.compositesw.com/services/system/admin/user}userRightsList"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupNames" type="{http://www.compositesw.com/services/system/admin/user}domainMemberReferenceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "name",
    "domainName",
    "id",
    "explicitRights",
    "effectiveRights",
    "inheritedRights",
    "annotation",
    "groupNames"
})
public class User {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String domainName;
    protected int id;
    @XmlElement(required = true)
    protected String explicitRights;
    @XmlElement(required = true)
    protected String effectiveRights;
    @XmlElement(required = true)
    protected String inheritedRights;
    protected String annotation;
    protected DomainMemberReferenceList groupNames;

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
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the explicitRights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplicitRights() {
        return explicitRights;
    }

    /**
     * Sets the value of the explicitRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplicitRights(String value) {
        this.explicitRights = value;
    }

    /**
     * Gets the value of the effectiveRights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveRights() {
        return effectiveRights;
    }

    /**
     * Sets the value of the effectiveRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveRights(String value) {
        this.effectiveRights = value;
    }

    /**
     * Gets the value of the inheritedRights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritedRights() {
        return inheritedRights;
    }

    /**
     * Sets the value of the inheritedRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritedRights(String value) {
        this.inheritedRights = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the groupNames property.
     * 
     * @return
     *     possible object is
     *     {@link DomainMemberReferenceList }
     *     
     */
    public DomainMemberReferenceList getGroupNames() {
        return groupNames;
    }

    /**
     * Sets the value of the groupNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainMemberReferenceList }
     *     
     */
    public void setGroupNames(DomainMemberReferenceList value) {
        this.groupNames = value;
    }

}
