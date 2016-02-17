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
			
			if(getPaymentStatus()){
				ticket.setStatus("Confirmed");
				ticket.setTicketId(789120);
				ticket.setErrors(false);
				ticket.setFromAddr(pInfo.getFromAddr());
				ticket.setToAddr(pInfo.getToAddr());
				ticket.setPersonName(pInfo.getPassengerName());
			}
		}
		else{
			ticket.setErrors(true);
		}
		return ticket;
	}
	
	
	//should talk to payment component
	private boolean getPaymentStatus(){
		//have some serious logic to get payment status
		return true;
	}

}
