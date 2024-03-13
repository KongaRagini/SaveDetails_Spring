package com.infy.service;

import java.util.List;

import com.infy.dto.ProductDTO;
import com.infy.entiy.ProductEntity;

//import com.ecommerce.DTO.ProductDTO;
//import com.ecommerce.Entity.ProductEntity;

//import com.becoder.model.Product;

public interface ProductService {

	public ProductEntity saveProduct(ProductEntity productEntity);

	public List<ProductEntity> getAllProduct();

	public ProductEntity getProductById(Integer id);

	public String deleteProduct(Integer id);

	public ProductEntity editProduct(ProductEntity product,Integer id);
	
}