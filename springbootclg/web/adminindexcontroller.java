package com.klef.jfsd.springbootclg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/index")
public class adminindexcontroller {

    @GetMapping
    public String index() {
        return "adminIndex"; // This should correspond to adminIndex.jsp
    }
}