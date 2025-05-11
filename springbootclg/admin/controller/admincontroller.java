package com.klef.jfsd.springbootclg.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springbootclg.admin.service.adminservice;
import com.klef.jfsd.springbootclg.adminDto.adminDto;

@RestController
@RequestMapping("/admin")
public class admincontroller {

    @Autowired
    private adminservice adminService;

    @GetMapping("/all")
    public ResponseEntity<List<adminDto>> getAllAdmins() {
        List<adminDto> admins = adminService.findAll();
        return ResponseEntity.ok(admins);
    }

    @GetMapping("/{id}")
    public ResponseEntity<adminDto> getAdminById(@PathVariable String id) {
        adminDto admin = adminService.specificBook(id);
        if (admin != null) {
            return ResponseEntity.ok(admin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/books")
    public ResponseEntity<List<adminDto>> getAllBooks() {
        List<adminDto> books = adminService.allBooks();
        return ResponseEntity.ok(books);
    }
}
