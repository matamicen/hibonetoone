package com.example.HibOneToOne.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "book")
public class book {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "theBook")
	private bookDetail bookdetail;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public bookDetail getBookdetail() {
		return bookdetail;
	}

	public void setBookdetail(bookDetail bookdetail) {
		this.bookdetail = bookdetail;
	}
	

}
