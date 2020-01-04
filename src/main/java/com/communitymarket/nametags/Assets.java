package com.communitymarket.nametags;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Assets {

	@JsonProperty("730")
	private  CSGOListing csgoListing;
	
}
