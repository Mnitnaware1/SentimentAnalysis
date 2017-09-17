package com.main.dao;

import java.util.List;

import com.main.entity.Product;

public interface IProduct {
	public String saveProduct(Product Product);
	public String updateProduct(Product Product);
	public String deleteProduct(Product Product);
	public List<Product> listProduct();
	public List<Product> getProduct(Integer primary);
}
