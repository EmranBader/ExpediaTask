package com.emran.expedia.model.offer.packages;

/**
 * Created by ebader on 3/4/17.
 */
public class PackagePricingInfo {

	private String currencyCode;
	private Double perPsgrPackagePrice;
	private Double totalPackagePrice;
	private Double perPsgrSavings;
	private Double totalSavings;
	private Double percentSavings;
	private Double savingsPctOfHotel;
	private Double savingsPctOfFlight;

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Double getPerPsgrPackagePrice() {
		return perPsgrPackagePrice;
	}

	public void setPerPsgrPackagePrice(Double perPsgrPackagePrice) {
		this.perPsgrPackagePrice = perPsgrPackagePrice;
	}

	public Double getTotalPackagePrice() {
		return totalPackagePrice;
	}

	public void setTotalPackagePrice(Double totalPackagePrice) {
		this.totalPackagePrice = totalPackagePrice;
	}

	public Double getPerPsgrSavings() {
		return perPsgrSavings;
	}

	public void setPerPsgrSavings(Double perPsgrSavings) {
		this.perPsgrSavings = perPsgrSavings;
	}

	public Double getTotalSavings() {
		return totalSavings;
	}

	public void setTotalSavings(Double totalSavings) {
		this.totalSavings = totalSavings;
	}

	public Double getPercentSavings() {
		return percentSavings;
	}

	public void setPercentSavings(Double percentSavings) {
		this.percentSavings = percentSavings;
	}

	public Double getSavingsPctOfHotel() {
		return savingsPctOfHotel;
	}

	public void setSavingsPctOfHotel(Double savingsPctOfHotel) {
		this.savingsPctOfHotel = savingsPctOfHotel;
	}

	public Double getSavingsPctOfFlight() {
		return savingsPctOfFlight;
	}

	public void setSavingsPctOfFlight(Double savingsPctOfFlight) {
		this.savingsPctOfFlight = savingsPctOfFlight;
	}
}
