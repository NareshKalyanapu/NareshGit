package com.java.soapclient;

import org.irctc.reservation.wsdl.BusInfo;
import org.irctc.reservation.wsdl.PassengerInfo;
import org.irctc.reservation.wsdl.Ticket;

import com.irctc.reservation.service.Reservation;
import com.irctc.reservation.service.ReservationImplService;

public class SoapClient {

	public static void main(String[] args) {

		ReservationImplService service=new ReservationImplService();
		Reservation reservation= service.getReservationImplPort();
		Ticket ticket = reservation.doReservation(getBusInfo(), getPassengerInfo());
		System.out.println("Hi your Ticket No:"+ticket.getTicketId()+" was "+ticket.getStatus()+" from "+ticket.getFromAddr()+" to "+ticket.getToAddr());
		
	}
	
	//stub methods getBusInfo(),getPassengerInfo()
	private static BusInfo getBusInfo(){
		BusInfo bInfo = new BusInfo();
		bInfo.setBusId(12345);
		bInfo.setBusName("BUS-Volvo");
		bInfo.setType("AC");
		return bInfo;
	}
	
	private static PassengerInfo getPassengerInfo(){
		PassengerInfo pInfo = new PassengerInfo();
		pInfo.setAge(22);
		pInfo.setFromAddr("Pune");
		pInfo.setToAddr("Hyderabad");
		pInfo.setPassengerName("Naresh Kumar");
		pInfo.setPassengerId(123456);
		return pInfo;
	}

}
