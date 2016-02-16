
package com.irctc.reservation.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "doReservationResponse", namespace = "http://irctc.org/reservation/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doReservationResponse", namespace = "http://irctc.org/reservation/wsdl")
public class DoReservationResponse {

    @XmlElement(name = "return", namespace = "http://irctc.org/reservation/types")
    private com.irctc.model.Ticket _return;

    /**
     * 
     * @return
     *     returns Ticket
     */
    public com.irctc.model.Ticket getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.irctc.model.Ticket _return) {
        this._return = _return;
    }

}
