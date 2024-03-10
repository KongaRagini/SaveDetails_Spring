package com.infy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.ProductDTO;
import com.infy.entiy.ProductEntity;
import com.infy.repo.ProductRepo;

//import com.ecommerce.DTO.ProductDTO;
//import com.ecommerce.Entity.ProductEntity;
//import com.ecommerce.Repo.ProductRepo;

import jakarta.transaction.Transactional;
//import com.ecommerce.Repo.ProductRepository;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
      private ProductRepo productRepo;
	@Override
	public ProductEntity saveProduct(ProductEntity productentity) {
		
		// TODO Auto-generated method stub
	ProductEntity p=productRepo.save(productentity);
	return p;
	}

	@Override
	public List<ProductEntity> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public ProductEntity getProductById(Integer id) {
		
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		// TODO Auto-generated method stub
	ProductEntity product=productRepo.findById(id).get();
	if(product!=null) {
		productRepo.delete(product);
		return "product delted successfully";
	}
		return "something wrong in server";
	
	}

	@Override
	public ProductEntity editProduct(ProductEntity product, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}