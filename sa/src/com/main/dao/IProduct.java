package com.main.dao;

import java.util.List;

public interface IProduct {
	public String saveProduct(Object object);
	public String updateProduct(Object object);
	public String deleteProduct(Object object);
	public List<Object> listProduct();
	public List<Object> getProduct(Integer primary);
}
