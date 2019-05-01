package com.example.HibOneToOne.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HibOneToOne.model.book;
import com.example.HibOneToOne.model.bookDetail;
import com.example.HibOneToOne.repository.DaoBook;
import com.example.HibOneToOne.repository.DaoBookDetail;



@RestController
@RequestMapping({"/books"})
public class mainController {
	
	@Autowired
	DaoBook daobook;
	
	@Autowired
	DaoBookDetail daobookdetail;
	

@GetMapping	
public ResponseEntity<Object> getAllBooks() {
	
	
	List<book> bookFounds = daobook.findAll();

	if (bookFounds.size()>0) {	
		
		 for(book b: bookFounds) {
			 System.out.println("book name:"+b.getName());
	     }
			 
		 }
			 

	
	 JSONObject obj = new JSONObject();
	 

     obj.put("error", 0);
     obj.put("saludo", "Hola che!!!!!!!!!");
     
     

     	return ResponseEntity.ok().body(obj.toString());
		
	
	
	}

@PostMapping
public book createBook(@RequestBody book b){
	
	bookDetail bookdetail;
	
    bookdetail = new bookDetail();
    bookdetail.setAutor("James Cameron");
    bookdetail.setEditorial("MGM");
    bookdetail.setTheBook(b);
    
    daobookdetail.save(bookdetail);
    
    book respuesta = daobook.save(b);
	
	
    
    return respuesta;
    
    
}

	

}
