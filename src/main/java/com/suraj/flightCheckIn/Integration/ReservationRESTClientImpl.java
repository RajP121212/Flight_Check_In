package com.suraj.flightCheckIn.Integration;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.suraj.flightCheckIn.Integration.dataTransferObject.Reservation;
import com.suraj.flightCheckIn.Integration.dataTransferObject.UpdateReservationRequest;

@RestController
public class ReservationRESTClientImpl implements IReservationRESTClient {

	private static final String RESERVATION_REST_URL = "http://localhost8080/flightReservation/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL + id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(UpdateReservationRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.patchForObject(RESERVATION_REST_URL, request, Reservation.class);
		return reservation;
	}

}
