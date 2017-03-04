package com.emran.expedia.model.offer;

/**
 * Created by ebader on 3/4/17.
 */
public class OfferInfo {

	private String siteID;
	private String language;
	private String currency;

	public String getSiteID() {
		return siteID;
	}

	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
