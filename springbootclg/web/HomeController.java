package com.klef.jfsd.springbootclg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
    public String HomePage() {
        return "Home"; // This will return the newbooks.html template
    }
}
