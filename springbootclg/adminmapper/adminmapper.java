package com.klef.jfsd.springbootclg.adminmapper;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.klef.jfsd.springbootclg.admin.entity.admin;
import com.klef.jfsd.springbootclg.adminDto.adminDto;

public class adminmapper {

    // Convert Admin entity to adminDto
    public static adminDto mapToAdminDto(admin admin) {
        if (admin == null) {
            return null;
        }
        return new adminDto(admin.getUsername(), admin.getPassword());
    }

    // Convert adminDto to Admin entity
    public static admin mapToAdminEntity(adminDto adminDto) {
        if (adminDto == null) {
            return null;
        }
        admin admin = new admin();
        admin.setUsername(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        return admin;
    }
}

