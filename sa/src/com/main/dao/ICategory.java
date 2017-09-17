package com.main.dao;

import java.util.List;

import com.main.entity.Category;

public interface ICategory {
	public String saveCategory(Category object);
	public String updateCategory(Category object);
	public String deleteCategory(Category object);
	public List<Category> listCategory();
	public List<Category> getCategory(Integer primary);
}
