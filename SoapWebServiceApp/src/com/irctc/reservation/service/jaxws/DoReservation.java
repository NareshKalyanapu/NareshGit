
package com.irctc.reservation.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "doReservation", namespace = "http://irctc.org/reservation/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doReservation", namespace = "http://irctc.org/reservation/wsdl", propOrder = {
    "bInfo",
    "pInfo"
})
public class DoReservation {

    @XmlElement(name = "bInfo", namespace = "")
    private com.irctc.model.BusInfo bInfo;
    @XmlElement(name = "pInfo", namespace = "http://irctc.org/reservation/types")
    private com.irctc.model.PassengerInfo pInfo;

    /**
     * 
     * @return
     *     returns BusInfo
     */
    public com.irctc.model.BusInfo getBInfo() {
        return this.bInfo;
    }

    /**
     * 
     * @param bInfo
     *     the value for the bInfo property
     */
    public void setBInfo(com.irctc.model.BusInfo bInfo) {
        this.bInfo = bInfo;
    }

    /**
     * 
     * @return
     *     returns PassengerInfo
     */
    public com.irctc.model.PassengerInfo getPInfo() {
        return this.pInfo;
    }

    /**
     * 
     * @param pInfo
     *     the value for the pInfo property
     */
    public void setPInfo(com.irctc.model.PassengerInfo pInfo) {
        this.pInfo = pInfo;
    }

}
