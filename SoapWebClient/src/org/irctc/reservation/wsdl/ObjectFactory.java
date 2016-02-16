
package org.irctc.reservation.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.irctc.reservation.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoReservationResponse_QNAME = new QName("http://irctc.org/reservation/wsdl", "doReservationResponse");
    private final static QName _DoReservation_QNAME = new QName("http://irctc.org/reservation/wsdl", "doReservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.irctc.reservation.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoReservation }
     * 
     */
    public DoReservation createDoReservation() {
        return new DoReservation();
    }

    /**
     * Create an instance of {@link DoReservationResponse }
     * 
     */
    public DoReservationResponse createDoReservationResponse() {
        return new DoReservationResponse();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link PassengerInfo }
     * 
     */
    public PassengerInfo createPassengerInfo() {
        return new PassengerInfo();
    }

    /**
     * Create an instance of {@link BusInfo }
     * 
     */
    public BusInfo createBusInfo() {
        return new BusInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://irctc.org/reservation/wsdl", name = "doReservationResponse")
    public JAXBElement<DoReservationResponse> createDoReservationResponse(DoReservationResponse value) {
        return new JAXBElement<DoReservationResponse>(_DoReservationResponse_QNAME, DoReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://irctc.org/reservation/wsdl", name = "doReservation")
    public JAXBElement<DoReservation> createDoReservation(DoReservation value) {
        return new JAXBElement<DoReservation>(_DoReservation_QNAME, DoReservation.class, null, value);
    }

}
