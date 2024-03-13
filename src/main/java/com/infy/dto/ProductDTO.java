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
	
	private String productCategory;
	
	private String productSubcategory;
	
	private String description;

	private Integer quantity;

	private Double price;

	private String status;



	

	public ProductDTO(Integer id, String productName, String productCategory, String productSubcategory,
			String description, Integer quantity, Double price, String status) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productSubcategory = productSubcategory;
		this.description = description;
		this.quantity = quantity;
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



	public String getProductCategory() {
		return productCategory;
	}



	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}



	public String getProductSubcategory() {
		return productSubcategory;
	}



	public void setProductSubcategory(String productSubcategory) {
		this.productSubcategory = productSubcategory;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Integer getquantity() {
		return quantity;
	}



	public void setquantity(Integer quantity) {
		this.quantity = quantity;
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
		return "ProductDTO [id=" + id + ", productName=" + productName + ", productCategory=" + productCategory
				+ ", productSubcategory=" + productSubcategory + ", description=" + description + ", quantity="
				+ quantity + ", price=" + price + ", status=" + status + "]";
	}
	
}
