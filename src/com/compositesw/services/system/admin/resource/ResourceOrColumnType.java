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
 * <p>Java class for resourceOrColumnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resourceOrColumnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="COLUMN"/>
 *     &lt;enumeration value="CONTAINER"/>
 *     &lt;enumeration value="DATA_SOURCE"/>
 *     &lt;enumeration value="DEFINITION_SET"/>
 *     &lt;enumeration value="LINK"/>
 *     &lt;enumeration value="PROCEDURE"/>
 *     &lt;enumeration value="TABLE"/>
 *     &lt;enumeration value="TREE"/>
 *     &lt;enumeration value="TRIGGER"/>
 *     &lt;enumeration value="RELATIONSHIP"/>
 *     &lt;enumeration value="MODEL"/>
 *     &lt;enumeration value="POLICY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resourceOrColumnType")
@XmlEnum
public enum ResourceOrColumnType {

    NONE,
    COLUMN,
    CONTAINER,
    DATA_SOURCE,
    DEFINITION_SET,
    LINK,
    PROCEDURE,
    TABLE,
    TREE,
    TRIGGER,
    RELATIONSHIP,
    MODEL,
    POLICY;

    public String value() {
        return name();
    }

    public static ResourceOrColumnType fromValue(String v) {
        return valueOf(v);
    }

}
