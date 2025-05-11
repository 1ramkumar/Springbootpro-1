package com.klef.jfsd.springbootclg.adminRepoistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.springbootclg.admin.entity.admin;

public interface adminRepo  extends JpaRepository<admin, String>{

}
