package com.irctc.reservation.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.irctc.model.BusInfo;
import com.irctc.model.PassengerInfo;
import com.irctc.model.Ticket;

@WebService(name = "Reservation", targetNamespace = "http://irctc.org/reservation/wsdl")
public interface Reservation {

	@WebMethod(operationName = "doReservation",action="http://irctc.org/reservation/wsdl#doReservation")
	public @WebResult(name = "result", targetNamespace = "http://irctc.org/reservation/types") Ticket doReservation(
			@WebParam(name = "bInfo") BusInfo bInfo,
			@WebParam(name = "pInfo", targetNamespace = "http://irctc.org/reservation/types") PassengerInfo pInfo);
}
