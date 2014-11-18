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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tableType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALIAS"/>
 *     &lt;enumeration value="GLOBAL_TEMPORARY"/>
 *     &lt;enumeration value="LOCAL_TEMPORARY"/>
 *     &lt;enumeration value="SYNONYM"/>
 *     &lt;enumeration value="SYSTEM_TABLE"/>
 *     &lt;enumeration value="TABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="VIEW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tableType")
@XmlEnum
public enum TableType {

    ALIAS,
    GLOBAL_TEMPORARY,
    LOCAL_TEMPORARY,
    SYNONYM,
    SYSTEM_TABLE,
    TABLE,
    UNKNOWN,
    VIEW;

    public String value() {
        return name();
    }

    public static TableType fromValue(String v) {
        return valueOf(v);
    }

}
