package com.suraj.flightCheckIn.Integration;

import com.suraj.flightCheckIn.Integration.dataTransferObject.Reservation;
import com.suraj.flightCheckIn.Integration.dataTransferObject.UpdateReservationRequest;

public interface IReservationRESTClient {

	//This interface is responsible for making rest web service calls
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(UpdateReservationRequest request);
	
}
