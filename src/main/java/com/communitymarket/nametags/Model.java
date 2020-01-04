package com.communitymarket.nametags;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class Model {
//	private LinkedHashMap<String, Item> assets;
	private Map<String, Listinginfo> listinginfo;
	@JsonIgnore
	private Object resultsHtml;
}
