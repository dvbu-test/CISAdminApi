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
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transportSecurityLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transportSecurityLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="HTTPS"/>
 *     &lt;enumeration value="HTTPS_WITH_X509_CERT_AUTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transportSecurityLevel")
@XmlEnum
public enum TransportSecurityLevel {

    NONE("NONE"),
    HTTPS("HTTPS"),
    @XmlEnumValue("HTTPS_WITH_X509_CERT_AUTH")
    HTTPS_WITH_X_509_CERT_AUTH("HTTPS_WITH_X509_CERT_AUTH");
    private final String value;

    TransportSecurityLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransportSecurityLevel fromValue(String v) {
        for (TransportSecurityLevel c: TransportSecurityLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
