package com.main.dao;

import java.util.List;

import com.main.entity.Review;

public interface IReview {
	public String saveReview(Review Review);
	public String updateReview(Review Review);
	public String deleteReview(Review Review);
	public List<Review> listReview();
	public List<Review> getReview(Integer primary);
}
