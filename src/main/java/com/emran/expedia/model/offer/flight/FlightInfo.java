package com.emran.expedia.model.offer.flight;

/**
 * Created by ebader on 3/4/17.
 */
public class FlightInfo {

	private Long travelProductID;
	private String flightDealCarrier;
	private String lastObservedDate;
	private Long lengthOfStay;
	private Long flightOutboundStops;
	private Long flightReturnStops;
	private String tripType;

	public Long getTravelProductID() {
		return travelProductID;
	}

	public void setTravelProductID(Long travelProductID) {
		this.travelProductID = travelProductID;
	}

	public String getFlightDealCarrier() {
		return flightDealCarrier;
	}

	public void setFlightDealCarrier(String flightDealCarrier) {
		this.flightDealCarrier = flightDealCarrier;
	}

	public String getLastObservedDate() {
		return lastObservedDate;
	}

	public void setLastObservedDate(String lastObservedDate) {
		this.lastObservedDate = lastObservedDate;
	}

	public Long getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Long lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public Long getFlightOutboundStops() {
		return flightOutboundStops;
	}

	public void setFlightOutboundStops(Long flightOutboundStops) {
		this.flightOutboundStops = flightOutboundStops;
	}

	public Long getFlightReturnStops() {
		return flightReturnStops;
	}

	public void setFlightReturnStops(Long flightReturnStops) {
		this.flightReturnStops = flightReturnStops;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
}
