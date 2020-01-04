package com.communitymarket.nametags;

import java.util.Arrays;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ItemRetrievalClient {
	
	
	private static final String URL_MARKET = 
			"https://steamcommunity.com/market/listings/730/AK-47%20%7C%20Redline%20%28Field-Tested%29/render/?query=&start=0&count=100&country=ES&language=english&currency=3";

	private static final String USER_AGENT_KEY = "user-agent";
	private static final String USER_AGENT_VALUE = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36";

	public ResponseEntity<Model> getItems() {
		RestTemplate rt =
//				buildRestTemplate();
				new RestTemplate();
		HttpHeaders headers = buildHeaders(rt);
		log.info("Retrieving items");
		ResponseEntity<Model> model = rt.getForEntity(URL_MARKET, Model.class, headers);
		log.info("Retrieved");
		return model;
	}
	
	public Model getModel() {
		RestTemplate rt =
//				buildRestTemplate();
				new RestTemplate();
		return rt.getForObject(URL_MARKET, Model.class);
	}

	private HttpHeaders buildHeaders(RestTemplate rt) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add(USER_AGENT_KEY,	USER_AGENT_VALUE);
		return headers;
	}

	private static RestTemplate buildRestTemplate() {
		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier()).build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		return new RestTemplate(requestFactory);
	}
	
}
