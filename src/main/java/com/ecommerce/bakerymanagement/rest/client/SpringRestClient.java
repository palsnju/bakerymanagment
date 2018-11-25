package com.ecommerce.bakerymanagement.rest.client;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpringRestClient {

	public Object call(String url, Map<String, String> headers, Object payload, HttpMethod httpMethod) {

		Object postResponse = null;
		try {

			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders httpHeaders = new HttpHeaders();

			if (headers != null)
				for (Map.Entry<String, String> headersEntry : headers.entrySet()) {
					httpHeaders.add(headersEntry.getKey(), headersEntry.getValue());
				}

			HttpEntity<?> httpEntity = new HttpEntity<>(payload, httpHeaders);

			postResponse = restTemplate.exchange(url, httpMethod, httpEntity, String.class);

			return postResponse;
		} catch (Exception e) {

		}
		return null;
	}

}
