package com.klef.jfsd.springbootclg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AboutController {
	@GetMapping("/about")
    public String AboutPage() {
        return "About"; // This will return the newbooks.html template
    }
}
