
package org.docx4j.jaxb.document;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Jc.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Jc">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="left"/>
 *     &lt;enumeration value="center"/>
 *     &lt;enumeration value="right"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_Jc")
@XmlEnum
public enum STJc {


    /**
     * Align Left
     * 
     */
    @XmlEnumValue("left")
    LEFT("left"),

    /**
     * Align Center
     * 
     */
    @XmlEnumValue("center")
    CENTER("center"),

    /**
     * Align Right
     * 
     */
    @XmlEnumValue("right")
    RIGHT("right"),

    /**
     * Justified
     * 
     */
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    STJc(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STJc fromValue(String v) {
        for (STJc c: STJc.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
