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
import javax.xml.bind.annotation.XmlType;
import com.compositesw.services.system.util.common.BaseResponse;


/**
 * <p>Java class for updateResourceStatisticsConfigResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateResourceStatisticsConfigResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.compositesw.com/services/system/util/common}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="statisticsConfig" type="{http://www.compositesw.com/services/system/admin/resource}resourceStatisticsConfig" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateResourceStatisticsConfigResponse", propOrder = {
    "statisticsConfig"
})
public class UpdateResourceStatisticsConfigResponse
    extends BaseResponse
{

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
