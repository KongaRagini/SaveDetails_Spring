package com.infy.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.dto.ProductDTO;
import com.infy.entiy.ProductEntity;

//import com.ecommerce.DTO.ProductDTO;
//import com.ecommerce.Entity.ProductEntity;

//import com.becoder.model.Product;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

	ProductEntity save(ProductDTO productdto);

}