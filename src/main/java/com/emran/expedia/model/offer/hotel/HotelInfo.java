package com.emran.expedia.model.offer.hotel;

/**
 * Created by ebader on 3/4/17.
 */
public class HotelInfo {

	private String hotelId;
	private String hotelName;
	private String hotelDestination;
	private String hotelDestinationRegionID;
	private String hotelLongDestination;
	private String hotelStreetAddress;
	private String hotelCity;
	private String hotelProvince; // FIXME: 3/4/17 don't forget this when figure it, same enum.
	private String hotelCountryCode; // FIXME: 3/4/17 same issue here.
	private String hotelLocation;
	private Double hotelLatitude;
	private Double hotelLongitude;
	private String hotelStarRating;
	private Double hotelGuestReviewRating;
	private String travelStartDate;
	private String travelEndDate;
	private String hotelImageUrl;
	private Double carPackageScore;
	private String description;
	private Double distanceFromUser;
	private String language; // FIXME: 3/4/17 this is impossible i think !
	private Double movingAverageScore;
	private Double promotionAmount;
	private String promotionDescription;
	private String promotionTag; // FIXME: 3/4/17 another type of enum.
	private Double rawAppealScore;
	private Double relevanceScore;
	private String statusCode; // FIXME: 3/4/17 maybe this one as well.
	private String statusDescription;
	private Boolean carPackage;
	private Boolean allInclusive;

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelDestination() {
		return hotelDestination;
	}

	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelProvince() {
		return hotelProvince;
	}

	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public Double getHotelLatitude() {
		return hotelLatitude;
	}

	public void setHotelLatitude(Double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	public Double getHotelLongitude() {
		return hotelLongitude;
	}

	public void setHotelLongitude(Double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	public String getHotelStarRating() {
		return hotelStarRating;
	}

	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	public Double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	public String getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(String travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public String getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(String travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	public Double getCarPackageScore() {
		return carPackageScore;
	}

	public void setCarPackageScore(Double carPackageScore) {
		this.carPackageScore = carPackageScore;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getDistanceFromUser() {
		return distanceFromUser;
	}

	public void setDistanceFromUser(Double distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Double getMovingAverageScore() {
		return movingAverageScore;
	}

	public void setMovingAverageScore(Double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}

	public Double getPromotionAmount() {
		return promotionAmount;
	}

	public void setPromotionAmount(Double promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	public String getPromotionDescription() {
		return promotionDescription;
	}

	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}

	public String getPromotionTag() {
		return promotionTag;
	}

	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}

	public Double getRawAppealScore() {
		return rawAppealScore;
	}

	public void setRawAppealScore(Double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	public Double getRelevanceScore() {
		return relevanceScore;
	}

	public void setRelevanceScore(Double relevanceScore) {
		this.relevanceScore = relevanceScore;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public Boolean getCarPackage() {
		return carPackage;
	}

	public void setCarPackage(Boolean carPackage) {
		this.carPackage = carPackage;
	}

	public Boolean getAllInclusive() {
		return allInclusive;
	}

	public void setAllInclusive(Boolean allInclusive) {
		this.allInclusive = allInclusive;
	}
}
