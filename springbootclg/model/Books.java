package com.klef.jfsd.springbootclg.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "Books_table")
public class Books {
	 @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
	    @SequenceGenerator(name = "id_generator", sequenceName = "your_entity_seq", initialValue = 1000, allocationSize = 1)
	    private int id;
@Column(name = "book_name", nullable= false, length= 100)
private String bookName;
@Column(name = "author_name", nullable= false, length= 100)
private String authorname;
@Column(name = "book_cost", nullable= false)
private  float cost;
@Column(name = "user_email", nullable= false, length= 100)
private String email;
@Column(name = "user_contactno", nullable= false, length= 20)
private String contactno;




}
