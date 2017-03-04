package com.emran.expedia.model.offer;

import com.emran.expedia.model.offer.flight.Flight;
import com.emran.expedia.model.offer.hotel.Hotel;
import com.emran.expedia.model.offer.packages.Package;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by ebader on 3/4/17.
 */
public class Offers {

	private List<Flight> flightOffer;
	private List<Hotel> hotelOffer;
	private List<Package> packageOffer;

	@JsonProperty("Flight")
	public List<Flight> getFlightOffer() {
		return flightOffer;
	}

	@JsonProperty("Flight")
	public void setFlightOffer(List<Flight> flightOffer) {
		this.flightOffer = flightOffer;
	}

	@JsonProperty("Hotel")
	public List<Hotel> getHotelOffer() {
		return hotelOffer;
	}

	@JsonProperty("Hotel")
	public void setHotelOffer(List<Hotel> hotelOffer) {
		this.hotelOffer = hotelOffer;
	}

	@JsonProperty("Package")
	public List<Package> getPackageOffer() {
		return packageOffer;
	}

	@JsonProperty("Package")
	public void setPackageOffer(List<Package> packageOffer) {
		this.packageOffer = packageOffer;
	}
}
