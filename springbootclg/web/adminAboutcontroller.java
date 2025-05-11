package com.klef.jfsd.springbootclg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/about")
public class adminAboutcontroller {

    @GetMapping
    public String about() {
        return "adminAbout"; // This should correspond to adminAbout.jsp
    }
}