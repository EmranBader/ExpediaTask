package com.emran.expedia.model.offer;

/**
 * Created by ebader on 3/4/17.
 */
public class BasicOfferInfo {

	private OfferDateRange offerDateRange;
	private Destination destination;

	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
}
