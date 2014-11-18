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

package com.compositesw.services.system.admin.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.compositesw.services.system.util.common.BaseRequest;


/**
 * <p>Java class for createCustomDataSourceTypeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCustomDataSourceTypeRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.compositesw.com/services/system/util/common}baseRequest">
 *       &lt;sequence>
 *         &lt;element name="dataSourceType" type="{http://www.compositesw.com/services/system/admin/resource}dataSourceTypeInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCustomDataSourceTypeRequest", propOrder = {
    "dataSourceType"
})
public class CreateCustomDataSourceTypeRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected DataSourceTypeInfo dataSourceType;

    /**
     * Gets the value of the dataSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceTypeInfo }
     *     
     */
    public DataSourceTypeInfo getDataSourceType() {
        return dataSourceType;
    }

    /**
     * Sets the value of the dataSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceTypeInfo }
     *     
     */
    public void setDataSourceType(DataSourceTypeInfo value) {
        this.dataSourceType = value;
    }

}
