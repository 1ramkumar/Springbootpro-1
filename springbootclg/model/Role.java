package com.klef.jfsd.springbootclg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "role" )
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public Role() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Role( String name) {
		super();
		this.name = name;
	}
	
	
	
}
