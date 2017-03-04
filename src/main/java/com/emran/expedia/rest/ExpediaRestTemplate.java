package com.emran.expedia.rest;

import com.emran.expedia.model.api.GetOfferApi;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

/**
 * Created by ebader on 3/4/17.
 */
@Component
public class ExpediaRestTemplate {

	@Value("${expedia.rest.offers-api-base-url:http://offersvc.expedia.com/offers/v2}")
	private String expediaOffersApiBaseUrl;

	private RestTemplate restTemplate = new RestTemplate();

	public Optional<GetOfferApi> getOffers(String destinationName, String minTripStartDate, String lengthOfStay) {
		ResponseEntity<GetOfferApi> responseEntity = restTemplate.getForEntity("{expediaOffersApiBaseUrl}/getOffers?scenario=deal-finder&page=1&uid=foo&productType=Hotel&destinationName={destinationName}&minTripStartDate=:{minTripStartDate}&lengthOfStay={lengthOfStay}",
				GetOfferApi.class, expediaOffersApiBaseUrl, destinationName, minTripStartDate, lengthOfStay);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			GetOfferApi response = responseEntity.getBody();
			if (response != null) {
				return Optional.of(response);
			} else {
				return Optional.empty();
			}
		} else {
			return Optional.empty();
		}
	}

}
