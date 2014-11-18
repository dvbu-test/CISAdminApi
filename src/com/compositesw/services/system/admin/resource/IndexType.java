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
 * <p>Java class for indexType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="indexType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="STATISTIC"/>
 *     &lt;enumeration value="CLUSTERED"/>
 *     &lt;enumeration value="HASHED"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PRIMARY_KEY"/>
 *     &lt;enumeration value="FOREIGN_KEY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "indexType")
@XmlEnum
public enum IndexType {

    UNKNOWN,
    STATISTIC,
    CLUSTERED,
    HASHED,
    OTHER,
    PRIMARY_KEY,
    FOREIGN_KEY;

    public String value() {
        return name();
    }

    public static IndexType fromValue(String v) {
        return valueOf(v);
    }

}
