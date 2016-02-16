
package org.irctc.reservation.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passengerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passengerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fromAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passengerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passengerInfo", propOrder = {
    "age",
    "fromAddr",
    "passengerId",
    "passengerName",
    "toAddr"
})
public class PassengerInfo {

    protected int age;
    protected String fromAddr;
    protected int passengerId;
    protected String passengerName;
    protected String toAddr;

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the fromAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddr() {
        return fromAddr;
    }

    /**
     * Sets the value of the fromAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddr(String value) {
        this.fromAddr = value;
    }

    /**
     * Gets the value of the passengerId property.
     * 
     */
    public int getPassengerId() {
        return passengerId;
    }

    /**
     * Sets the value of the passengerId property.
     * 
     */
    public void setPassengerId(int value) {
        this.passengerId = value;
    }

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the toAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddr() {
        return toAddr;
    }

    /**
     * Sets the value of the toAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddr(String value) {
        this.toAddr = value;
    }

}
