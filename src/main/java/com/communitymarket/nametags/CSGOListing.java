package com.communitymarket.nametags;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CSGOListing {

	@JsonProperty("730")
	private InnerCSGOListing innerCSGOListing;
	
}
