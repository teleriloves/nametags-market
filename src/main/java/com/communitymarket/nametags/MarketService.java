package com.communitymarket.nametags;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MarketService {

	@Autowired private ItemRetrievalClient client;
	
	public Model getListings() {
		Model model = 
//				client.getItems().getBody();
				client.getModel();
		log.info(model.toString());
		return null;
	}
	
}
