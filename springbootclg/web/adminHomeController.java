package com.klef.jfsd.springbootclg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/home")
public class adminHomeController {

    @GetMapping
    public String home() {
        return "adminHome"; // This should correspond to adminHome.jsp
    }
}