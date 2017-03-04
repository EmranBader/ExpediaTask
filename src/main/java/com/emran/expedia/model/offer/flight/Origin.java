package com.emran.expedia.model.offer.flight;

/**
 * Created by ebader on 3/4/17.
 */
public class Origin {

	private String longName;
	private String country;
	private String province;
	private String city;
	private String tla;
	private String metrocode;

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

	public String getTla() {
		return tla;
	}

	public void setTla(String tla) {
		this.tla = tla;
	}

	public String getMetrocode() {
		return metrocode;
	}

	public void setMetrocode(String metrocode) {
		this.metrocode = metrocode;
	}
}
