package com.linhrepo.spring.passtransfer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author linhvo
 *
 * https://github.com/linhvovn/medium
 */
@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
