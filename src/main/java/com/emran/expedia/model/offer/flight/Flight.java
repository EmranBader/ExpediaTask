package com.emran.expedia.model.offer.flight;

import com.emran.expedia.model.offer.BasicOfferInfo;

/**
 * Created by ebader on 3/4/17.
 */
public class Flight extends BasicOfferInfo{

	private FlightInfo flightInfo;
	private FlightPricingInfo flightPricingInfo;
	private FlightUrls flightUrls;
	private FlightScores flightScores;
	private Origin origin;

	public FlightInfo getFlightInfo() {
		return flightInfo;
	}

	public void setFlightInfo(FlightInfo flightInfo) {
		this.flightInfo = flightInfo;
	}

	public FlightPricingInfo getFlightPricingInfo() {
		return flightPricingInfo;
	}

	public void setFlightPricingInfo(FlightPricingInfo flightPricingInfo) {
		this.flightPricingInfo = flightPricingInfo;
	}

	public FlightUrls getFlightUrls() {
		return flightUrls;
	}

	public void setFlightUrls(FlightUrls flightUrls) {
		this.flightUrls = flightUrls;
	}

	public FlightScores getFlightScores() {
		return flightScores;
	}

	public void setFlightScores(FlightScores flightScores) {
		this.flightScores = flightScores;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}
}
