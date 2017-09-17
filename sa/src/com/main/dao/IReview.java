package com.main.dao;

import java.util.List;

public interface IReview {
	public String saveReview(Object object);
	public String updateReview(Object object);
	public String deleteReview(Object object);
	public List<Object> listReview();
	public List<Object> getReview(Integer primary);
}
