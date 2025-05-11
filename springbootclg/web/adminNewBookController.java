package com.klef.jfsd.springbootclg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/new-books")
public class adminNewBookController {

    @GetMapping
    public String newBooks() {
        return "adminNewBooks"; // This should correspond to adminNewBooks.jsp
    }
}