package com.emran.expedia.model.offer.packages;

/**
 * Created by ebader on 3/4/17.
 */
public class PackageUrls {

	private String packageSearchUrl;
	private FlightDeeplinks flightDeeplinks;
	private HotelDeeplinks hotelDeeplinks;

	public String getPackageSearchUrl() {
		return packageSearchUrl;
	}

	public void setPackageSearchUrl(String packageSearchUrl) {
		this.packageSearchUrl = packageSearchUrl;
	}

	public FlightDeeplinks getFlightDeeplinks() {
		return flightDeeplinks;
	}

	public void setFlightDeeplinks(FlightDeeplinks flightDeeplinks) {
		this.flightDeeplinks = flightDeeplinks;
	}

	public HotelDeeplinks getHotelDeeplinks() {
		return hotelDeeplinks;
	}

	public void setHotelDeeplinks(HotelDeeplinks hotelDeeplinks) {
		this.hotelDeeplinks = hotelDeeplinks;
	}

	class FlightDeeplinks {

		private String flightSearchUrl;

		public String getFlightSearchUrl() {
			return flightSearchUrl;
		}

		public void setFlightSearchUrl(String flightSearchUrl) {
			this.flightSearchUrl = flightSearchUrl;
		}
	}

	class HotelDeeplinks {
		private String hotelInfositeUrl;

		public String getHotelInfositeUrl() {
			return hotelInfositeUrl;
		}

		public void setHotelInfositeUrl(String hotelInfositeUrl) {
			this.hotelInfositeUrl = hotelInfositeUrl;
		}
	}
}
