package com.infy.dto;

//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface ProductDTO extends CrudRepository<ProductDTO,Integer>{
//
//}


public class ProductDTO {
	

	private Integer id;
 
	private String productName;

	private String description;

	private Double price;

	private String status;



	public ProductDTO(Integer id, String productName, String description, Double price, String status) {
	super();
	this.id = id;
	this.productName = productName;
	this.description = description;
	this.price = price;
	this.status = status;
}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", productName=" + productName + ", description=" + description + ", price="
				+ price + ", status=" + status + "]";
	}
	
}
