package com.klef.jfsd.springbootclg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/newbooks")
    public String showNewBooksPage() {
        return "newbooks"; // This will return the newbooks.html template
    }
}
