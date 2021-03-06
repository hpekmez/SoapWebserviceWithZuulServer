//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.24 at 01:38:55 PM TRT 
//


package com.example.demo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for size.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="size"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Light"/&gt;
 *     &lt;enumeration value="Average"/&gt;
 *     &lt;enumeration value="AverageHigh"/&gt;
 *     &lt;enumeration value="MVP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "size")
@XmlEnum
public enum Size {

    @XmlEnumValue("Light")
    LIGHT("Light"),
    @XmlEnumValue("Average")
    AVERAGE("Average"),
    @XmlEnumValue("AverageHigh")
    AVERAGE_HIGH("AverageHigh"),
    MVP("MVP");
    private final String value;

    Size(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Size fromValue(String v) {
        for (Size c: Size.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
