package com.github.enzoluchini.pingPong;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class PingPongApplicationTests {

	@Test
	void testPingRequest() {
		String url = "http://localhost:8080/api/ping";
		String expectedResponse = "pong";
		RestTemplate restTemplate = new RestTemplate();
		// When
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		// Then
		assertEquals(expectedResponse, response.getBody());
	}

}
