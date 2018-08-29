package com.suraj.flightCheckIn.Integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.suraj.flightCheckIn.Integration.dataTransferObject.Reservation;
import com.suraj.flightCheckIn.Integration.dataTransferObject.UpdateReservationRequest;

@Component
public class ReservationRESTClientImpl implements IReservationRESTClient {

	private static final String RESERVATION_REST_URL = "http://localhost:8080/flightReservation/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL + id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(UpdateReservationRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, request, Reservation.class);
		return reservation;
	}

}
