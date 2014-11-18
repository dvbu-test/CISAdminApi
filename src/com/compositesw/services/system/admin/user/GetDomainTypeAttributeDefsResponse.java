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
import com.compositesw.services.system.util.common.AttributeDefList;
import com.compositesw.services.system.util.common.BaseResponse;


/**
 * <p>Java class for getDomainTypeAttributeDefsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDomainTypeAttributeDefsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.compositesw.com/services/system/util/common}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="attributeDefs" type="{http://www.compositesw.com/services/system/util/common}attributeDefList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDomainTypeAttributeDefsResponse", propOrder = {
    "attributeDefs"
})
public class GetDomainTypeAttributeDefsResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected AttributeDefList attributeDefs;

    /**
     * Gets the value of the attributeDefs property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDefList }
     *     
     */
    public AttributeDefList getAttributeDefs() {
        return attributeDefs;
    }

    /**
     * Sets the value of the attributeDefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDefList }
     *     
     */
    public void setAttributeDefs(AttributeDefList value) {
        this.attributeDefs = value;
    }

}
