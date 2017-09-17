package com.main.dao;

import java.util.List;

public interface ICategory {
	public String saveCategory(Object object);
	public String updateCategory(Object object);
	public String deleteCategory(Object object);
	public List<Object> listCategory();
	public List<Object> getCategory(Integer primary);
}
