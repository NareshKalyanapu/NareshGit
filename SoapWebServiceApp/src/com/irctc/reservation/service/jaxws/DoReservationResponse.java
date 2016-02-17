
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

    @XmlElement(name = "result", namespace = "http://irctc.org/reservation/types")
    private com.irctc.model.Ticket result;

    /**
     * 
     * @return
     *     returns Ticket
     */
    public com.irctc.model.Ticket getResult() {
        return this.result;
    }

    /**
     * 
     * @param result
     *     the value for the result property
     */
    public void setResult(com.irctc.model.Ticket result) {
        this.result = result;
    }

}
