package com.irctc.reservation.service;

import javax.jws.WebService;

import com.irctc.model.BusInfo;
import com.irctc.model.PassengerInfo;
import com.irctc.model.Ticket;

@WebService(endpointInterface="com.irctc.reservation.service.Reservation")
public class ReservationImpl implements Reservation {
	private Ticket ticket;
	
	public ReservationImpl(){
		ticket = new  Ticket();
	}

	@Override
	public Ticket doReservation(BusInfo bInfo, PassengerInfo pInfo) {
		
		if(bInfo != null && pInfo !=null){
			ticket.setFromAddr(pInfo.getFromAddr());
			ticket.setToAddr(pInfo.getToAddr());
			if(getPaymentStatus()){
				ticket.setStatus("Confirmed");
				ticket.setTicketId(789120);
			}
			
			
		}
		return ticket;
	}
	
	private boolean getPaymentStatus(){
		return true;
	}

}
