package com.communitymarket.nametags;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Item {
	private String id;
	@JsonProperty("market_name")
	private String marketName;
	private List<String> fraudwarnings;
	
}
