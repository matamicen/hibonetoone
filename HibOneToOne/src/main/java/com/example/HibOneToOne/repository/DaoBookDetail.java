package com.example.HibOneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HibOneToOne.model.bookDetail;

public interface DaoBookDetail extends JpaRepository<bookDetail, Long> {

}
