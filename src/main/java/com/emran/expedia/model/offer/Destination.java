package com.emran.expedia.model.offer;

/**
 * Created by ebader on 3/4/17.
 */
public class Destination {

	private String regionID;
	private String longName;
	private String country; // FIXME: 3/4/17 must be enum too !
	private String province; // FIXME: 3/4/17 must be enum too !
	private String city;

	public String getRegionID() {
		return regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
