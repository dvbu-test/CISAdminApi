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


/**
 * <p>Java class for updateResourceStatisticsConfigRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateResourceStatisticsConfigRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.compositesw.com/services/system/admin/resource}pathTypeDetailRequest">
 *       &lt;sequence>
 *         &lt;element name="statisticsConfig" type="{http://www.compositesw.com/services/system/admin/resource}resourceStatisticsConfig"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateResourceStatisticsConfigRequest", propOrder = {
    "statisticsConfig"
})
public class UpdateResourceStatisticsConfigRequest
    extends PathTypeDetailRequest
{

    @XmlElement(required = true)
    protected ResourceStatisticsConfig statisticsConfig;

    /**
     * Gets the value of the statisticsConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceStatisticsConfig }
     *     
     */
    public ResourceStatisticsConfig getStatisticsConfig() {
        return statisticsConfig;
    }

    /**
     * Sets the value of the statisticsConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceStatisticsConfig }
     *     
     */
    public void setStatisticsConfig(ResourceStatisticsConfig value) {
        this.statisticsConfig = value;
    }

}
