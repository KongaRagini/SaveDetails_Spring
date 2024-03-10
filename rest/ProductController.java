package com.infy.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.ProductDTO;
import com.infy.entiy.ProductEntity;
import com.infy.service.ProductService;
//
//import com.ecommerce.DTO.ProductDTO;
//import com.ecommerce.Entity.ProductEntity;
//import com.ecommerce.Service.ProductService;

//import com.becoder.model.Product;
//import com.becoder.service.ProductService;
//@CrossOrigin(origins = "http://localhost:3009")


//header('Access-Control-Allow-Origin: *');
//header('Access-Control-Allow-Methods: POST, GET, OPTIONS, PUT, DELETE');
//header('Access-Control-Allow-Headers: Content-Type, X-Auth-Token, Origin, Authorization');
@CrossOrigin(origins = "http://localhost:3009")
@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/saveProduct")
	public ResponseEntity<?> saveProduct(@RequestBody ProductEntity productentity) {
		return new ResponseEntity<>(productService.saveProduct(productentity), HttpStatus.CREATED);
	}
	@CrossOrigin(origins = "http://localhost:3009")
	@GetMapping("/")
	public ResponseEntity<?> getAllProduct() {
		return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getProductById(Integer id) {
		return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
	}

	@GetMapping("/deleteProduct/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer id) {
		return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
	}

	@PostMapping("/editProduct/{id}")
	public ResponseEntity<?> editProduct(@RequestBody ProductEntity product, @PathVariable Integer id) {
		return new ResponseEntity<>(productService.editProduct(product, id), HttpStatus.CREATED);
	}

}






