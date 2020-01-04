package com.communitymarket.nametags;

import lombok.Data;

@Data
public class Listinginfo {
	    private String listingid;
	    private long price;
	    private long fee;
	    private long publisherFeeApp;
	    private String publisherFeePercent;
	    private long currencyid;
	    private long steamFee;
	    private long publisherFee;
	    private long convertedPrice;
	    private long convertedFee;
	    private long convertedCurrencyid;
	    private long convertedSteamFee;
	    private long convertedPublisherFee;
	    private long convertedPricePerUnit;
	    private long convertedFeePerUnit;
	    private long convertedSteamFeePerUnit;
	    private long convertedPublisherFeePerUnit;
}
