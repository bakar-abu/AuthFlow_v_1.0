package com.consoledot.authflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AuthFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthFlowApplication.class, args);
	}

	@Controller
	public static class HomeController {

		@GetMapping("/")
		public String home(Model model) {
			return "index";
		}
	}

	@Controller
	public static class AuthController {

		@GetMapping("/register")
		public String register() {
			return "register";
		}

		@GetMapping("/signin")
		public String signin() {
			return "signin";
		}

		@GetMapping("/dashboard")
		public String dashboard() {
			return "dashboard";
		}
	}
}
