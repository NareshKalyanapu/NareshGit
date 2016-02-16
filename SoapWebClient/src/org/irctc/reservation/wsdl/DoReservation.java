
package org.irctc.reservation.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bInfo" type="{http://irctc.org/reservation/wsdl}busInfo" minOccurs="0"/>
 *         &lt;element ref="{http://irctc.org/reservation/types}pInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doReservation", propOrder = {
    "bInfo",
    "pInfo"
})
public class DoReservation {

    protected BusInfo bInfo;
    @XmlElement(namespace = "http://irctc.org/reservation/types")
    protected PassengerInfo pInfo;

    /**
     * Gets the value of the bInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BusInfo }
     *     
     */
    public BusInfo getBInfo() {
        return bInfo;
    }

    /**
     * Sets the value of the bInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusInfo }
     *     
     */
    public void setBInfo(BusInfo value) {
        this.bInfo = value;
    }

    /**
     * Gets the value of the pInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfo }
     *     
     */
    public PassengerInfo getPInfo() {
        return pInfo;
    }

    /**
     * Sets the value of the pInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfo }
     *     
     */
    public void setPInfo(PassengerInfo value) {
        this.pInfo = value;
    }

}
