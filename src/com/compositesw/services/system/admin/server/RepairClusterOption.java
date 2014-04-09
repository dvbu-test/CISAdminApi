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

package com.compositesw.services.system.admin.server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repairClusterOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="repairClusterOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREVIEW_MERGE_CONFLICTS"/>
 *     &lt;enumeration value="MERGE_IF_NO_CONFLICTS"/>
 *     &lt;enumeration value="OVERWRITE_MERGE_CONFLICTS"/>
 *     &lt;enumeration value="REPAIR_FULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "repairClusterOption")
@XmlEnum
public enum RepairClusterOption {

    PREVIEW_MERGE_CONFLICTS,
    MERGE_IF_NO_CONFLICTS,
    OVERWRITE_MERGE_CONFLICTS,
    REPAIR_FULL;

    public String value() {
        return name();
    }

    public static RepairClusterOption fromValue(String v) {
        return valueOf(v);
    }

}
