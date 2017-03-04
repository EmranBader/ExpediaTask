package com.emran.expedia.model.offer.hotel;

/**
 * Created by ebader on 3/4/17.
 */
public class HotelScores {

	private Double rawAppealScore;
	private Double movingAverageScore;

	public Double getRawAppealScore() {
		return rawAppealScore;
	}

	public void setRawAppealScore(Double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	public Double getMovingAverageScore() {
		return movingAverageScore;
	}

	public void setMovingAverageScore(Double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}
}
