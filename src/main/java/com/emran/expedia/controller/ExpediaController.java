package com.emran.expedia.controller;

import com.emran.expedia.model.api.GetOfferApi;
import com.emran.expedia.rest.ExpediaRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

/**
 * Created by ebader on 3/4/17.
 */
@Controller
@RequestMapping("/expedia")
public class ExpediaController {

	@Autowired
	private ExpediaRestTemplate expediaRestTemplate;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHome(Model model) {
		return "home";
	}

	@RequestMapping(value = "/test-url", method = RequestMethod.GET)
	public String test(@RequestParam("lengthOfStay") String lengthOfStay, @RequestParam("minTripStartDate") String minTripStartDate, @RequestParam("destinationName") String destinationName, Model model) {

		Optional<GetOfferApi> api = expediaRestTemplate.getOffers(destinationName, minTripStartDate, lengthOfStay);

		if (api.isPresent()) {
			GetOfferApi offers = api.get();
			model.addAttribute("hotelOffers", offers.getOffers().getHotelOffer());
			//add offers for package and flight here if you want.
		} else {
			model.addAttribute("offers", null);
		}

		return "offers";
	}

}
