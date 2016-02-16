
package org.irctc.reservation.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for busInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="busInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="busId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="busName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busInfo", propOrder = {
    "busId",
    "busName",
    "type"
})
public class BusInfo {

    protected int busId;
    protected String busName;
    protected String type;

    /**
     * Gets the value of the busId property.
     * 
     */
    public int getBusId() {
        return busId;
    }

    /**
     * Sets the value of the busId property.
     * 
     */
    public void setBusId(int value) {
        this.busId = value;
    }

    /**
     * Gets the value of the busName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusName() {
        return busName;
    }

    /**
     * Sets the value of the busName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusName(String value) {
        this.busName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
