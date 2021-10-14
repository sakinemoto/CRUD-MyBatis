package com.example.application.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	    @GetMapping
		public String getLogin() {
			return "login/login";
		}
}
