package com.main.dao;

import java.util.List;

public interface IReviewType {
	public String saveReviewType(Object object);
	public String updateReviewType(Object object);
	public String deleteReviewType(Object object);
	public List<Object> listReviewType();
	public List<Object> getReviewType(Integer primary);
}
