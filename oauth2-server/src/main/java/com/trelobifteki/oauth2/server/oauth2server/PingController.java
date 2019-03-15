package com.trelobifteki.oauth2.server.oauth2server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

	@GetMapping
	public String getPing(@RequestParam("message") final String message) {
		return "Hello " + message;
	}
	
}
