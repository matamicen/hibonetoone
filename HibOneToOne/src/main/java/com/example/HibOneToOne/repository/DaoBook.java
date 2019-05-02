package com.example.HibOneToOne.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HibOneToOne.model.book;


@Repository
public interface DaoBook extends JpaRepository<book, Long> {
	
	public List<book> findByName(String name);

}
