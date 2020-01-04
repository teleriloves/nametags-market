package com.communitymarket.nametags;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/items")
public class MarketController {

	@Autowired MarketService service;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Model getModel() {
		return Optional.ofNullable(service.getListings()).orElse(null);
	}
	
}
