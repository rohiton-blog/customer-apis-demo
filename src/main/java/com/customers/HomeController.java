package com.customers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homepage() {
		return "index";
	}

	@RequestMapping("/customer-details")
	public String customerDetails() {
		return "customer-details";
	}

	@RequestMapping("/customer-apis")
	public String customerRestApisEndpoints() {
		return "customer-apis-docs";
	}
}
