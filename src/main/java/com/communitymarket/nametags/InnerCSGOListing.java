package com.communitymarket.nametags;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class InnerCSGOListing {
	@JsonProperty("2")
	private Map<String, Item> item;
	
}
