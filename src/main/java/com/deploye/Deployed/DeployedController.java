package com.deploye.Deployed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployedController {

	@GetMapping(path = "/welcome")
	public String getWelcome() {
		return "Welcome! to Deployed Page using amazon ec2 service";
	}
}
