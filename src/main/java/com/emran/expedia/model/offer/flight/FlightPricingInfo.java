package com.emran.expedia.model.offer.flight;

/**
 * Created by ebader on 3/4/17.
 */
public class FlightPricingInfo {

	private Double flightTotalBaseFare;
	private Double flightTotalTax;
	private Double flightTotalPrice;
	private Double flightPerPsgrBaseFare;
	private Double flightPerPsgrTax;
	private Double flightPerPsgrBaseFarePlusTax;
	private Double flightPerPsgrTotalPrice;
	private Double trendAgcyFlightPrice;
	private Double pctChangeFromTrend;

	public Double getFlightTotalBaseFare() {
		return flightTotalBaseFare;
	}

	public void setFlightTotalBaseFare(Double flightTotalBaseFare) {
		this.flightTotalBaseFare = flightTotalBaseFare;
	}

	public Double getFlightTotalTax() {
		return flightTotalTax;
	}

	public void setFlightTotalTax(Double flightTotalTax) {
		this.flightTotalTax = flightTotalTax;
	}

	public Double getFlightTotalPrice() {
		return flightTotalPrice;
	}

	public void setFlightTotalPrice(Double flightTotalPrice) {
		this.flightTotalPrice = flightTotalPrice;
	}

	public Double getFlightPerPsgrBaseFare() {
		return flightPerPsgrBaseFare;
	}

	public void setFlightPerPsgrBaseFare(Double flightPerPsgrBaseFare) {
		this.flightPerPsgrBaseFare = flightPerPsgrBaseFare;
	}

	public Double getFlightPerPsgrTax() {
		return flightPerPsgrTax;
	}

	public void setFlightPerPsgrTax(Double flightPerPsgrTax) {
		this.flightPerPsgrTax = flightPerPsgrTax;
	}

	public Double getFlightPerPsgrBaseFarePlusTax() {
		return flightPerPsgrBaseFarePlusTax;
	}

	public void setFlightPerPsgrBaseFarePlusTax(Double flightPerPsgrBaseFarePlusTax) {
		this.flightPerPsgrBaseFarePlusTax = flightPerPsgrBaseFarePlusTax;
	}

	public Double getFlightPerPsgrTotalPrice() {
		return flightPerPsgrTotalPrice;
	}

	public void setFlightPerPsgrTotalPrice(Double flightPerPsgrTotalPrice) {
		this.flightPerPsgrTotalPrice = flightPerPsgrTotalPrice;
	}

	public Double getTrendAgcyFlightPrice() {
		return trendAgcyFlightPrice;
	}

	public void setTrendAgcyFlightPrice(Double trendAgcyFlightPrice) {
		this.trendAgcyFlightPrice = trendAgcyFlightPrice;
	}

	public Double getPctChangeFromTrend() {
		return pctChangeFromTrend;
	}

	public void setPctChangeFromTrend(Double pctChangeFromTrend) {
		this.pctChangeFromTrend = pctChangeFromTrend;
	}
}
