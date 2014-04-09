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
 * <p>Java class for impactLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="impactLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="SYNTAX_ERROR"/>
 *     &lt;enumeration value="SECURITY"/>
 *     &lt;enumeration value="MISSING_RESOURCE"/>
 *     &lt;enumeration value="RESOURCE_IMPACTED"/>
 *     &lt;enumeration value="RESOURCE_MISMATCH"/>
 *     &lt;enumeration value="DESIGN_MISMATCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "impactLevel")
@XmlEnum
public enum ImpactLevel {

    NONE,
    UNKNOWN,
    SYNTAX_ERROR,
    SECURITY,
    MISSING_RESOURCE,
    RESOURCE_IMPACTED,
    RESOURCE_MISMATCH,
    DESIGN_MISMATCH;

    public String value() {
        return name();
    }

    public static ImpactLevel fromValue(String v) {
        return valueOf(v);
    }

}
