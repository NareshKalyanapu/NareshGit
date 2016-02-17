
package org.irctc.reservation.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.irctc.reservation.wsdl.PassengerInfo;
import org.irctc.reservation.wsdl.Ticket;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.irctc.reservation.types package. 
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

    private final static QName _Result_QNAME = new QName("http://irctc.org/reservation/types", "result");
    private final static QName _PInfo_QNAME = new QName("http://irctc.org/reservation/types", "pInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.irctc.reservation.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://irctc.org/reservation/types", name = "result")
    public JAXBElement<Ticket> createResult(Ticket value) {
        return new JAXBElement<Ticket>(_Result_QNAME, Ticket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://irctc.org/reservation/types", name = "pInfo")
    public JAXBElement<PassengerInfo> createPInfo(PassengerInfo value) {
        return new JAXBElement<PassengerInfo>(_PInfo_QNAME, PassengerInfo.class, null, value);
    }

}
