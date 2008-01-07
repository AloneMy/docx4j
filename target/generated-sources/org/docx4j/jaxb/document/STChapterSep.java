
package org.docx4j.jaxb.document;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_ChapterSep.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_ChapterSep">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hyphen"/>
 *     &lt;enumeration value="period"/>
 *     &lt;enumeration value="colon"/>
 *     &lt;enumeration value="emDash"/>
 *     &lt;enumeration value="enDash"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_ChapterSep")
@XmlEnum
public enum STChapterSep {


    /**
     * Hyphen Chapter
     * 						Separator
     * 
     */
    @XmlEnumValue("hyphen")
    HYPHEN("hyphen"),

    /**
     * Period Chapter
     * 						Separator
     * 
     */
    @XmlEnumValue("period")
    PERIOD("period"),

    /**
     * Colon Chapter Separator
     * 
     */
    @XmlEnumValue("colon")
    COLON("colon"),

    /**
     * Em Dash Chapter
     * 						Separator
     * 
     */
    @XmlEnumValue("emDash")
    EM_DASH("emDash"),

    /**
     * En Dash Chapter
     * 						Separator
     * 
     */
    @XmlEnumValue("enDash")
    EN_DASH("enDash");
    private final String value;

    STChapterSep(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STChapterSep fromValue(String v) {
        for (STChapterSep c: STChapterSep.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
