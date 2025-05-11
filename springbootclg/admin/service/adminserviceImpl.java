package com.klef.jfsd.springbootclg.admin.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springbootclg.adminDto.adminDto;
import com.klef.jfsd.springbootclg.adminRepoistory.adminRepo;
import com.klef.jfsd.springbootclg.adminmapper.adminmapper;

@Service
public class adminserviceImpl implements adminservice {
	 @Autowired
	    private adminRepo adminRepo;

	    @Override
	    public List<adminDto> findAll() {
	        return adminRepo.findAll().stream()
	                .map(admin -> new adminDto(admin.getUsername(), admin.getPassword())) // Assuming Admin has these fields
	                .collect(Collectors.toList());
	    }

	    @Override
	    public List<adminDto> findById(String id) {
	        return adminRepo.findById(id)
	                .map(adminmapper::mapToAdminDto) // Use the mapper to convert entity to DTO
	                .stream()
	                .collect(Collectors.toList());
	    }


//	    @Override
//	    public adminDto specificBook(String id) {
//	        return findById(id)
//	                .orElseThrow(() -> new RuntimeException("Book Not Found with ID: " + id)); // Throw an exception if not found
//	    }

	    @Override
	    public List<adminDto> allBooks() {
	        return findAll();
	    }

		@Override
		public adminDto specificBook(String id) {
			// TODO Auto-generated method stub
			return null;
		}
	}