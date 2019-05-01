package com.example.HibOneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HibOneToOne.model.book;

@Repository
public interface DaoBook extends JpaRepository<book, Long> {

}
