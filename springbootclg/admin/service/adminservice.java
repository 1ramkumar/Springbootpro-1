package com.klef.jfsd.springbootclg.admin.service;

import java.util.List;

import com.klef.jfsd.springbootclg.adminDto.adminDto;

public interface adminservice {
	 List<adminDto> findAll();
	    List <adminDto> findById(String id);
	    adminDto specificBook(String id); // Assuming this is to find a specific admin by ID
	    List<adminDto> allBooks(); // Assuming this is similar to findAll
	}