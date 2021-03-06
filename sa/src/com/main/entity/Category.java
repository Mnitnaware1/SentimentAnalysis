package com.main.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_category")
public class Category {
	@Id
	@Column(name = "id")
	private int id;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(int id, String categoryName, String categoryDescription, boolean isActive, int addedBy,
			int updatedBy, Date addedDate, Date updatedDate) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.categorDescription = categoryDescription;
		this.isActive = isActive;
		this.addedBy = addedBy;
		this.updatedBy = updatedBy;
		this.addedDate = addedDate;
		this.upadatedDate = updatedDate;
	}

	@Column(name = "category_name")
	private String categoryName;

	@Column(name = "category_description")
	private String categorDescription;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "added_by")
	private int addedBy;

	@Column(name = "update_by")
	private int updatedBy;

	@Column(name = "added_date")
	private Date addedDate;

	@Column(name = "upadated_date")
	private Date upadatedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategorDescription() {
		return categorDescription;
	}

	public void setCategorDescription(String categorDescription) {
		this.categorDescription = categorDescription;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(int addedBy) {
		this.addedBy = addedBy;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Date getUpadatedDate() {
		return upadatedDate;
	}

	public void setUpadatedDate(Date upadatedDate) {
		this.upadatedDate = upadatedDate;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", categorDescription=" + categorDescription
				+ ", isActive=" + isActive + ", addedBy=" + addedBy + ", updatedBy=" + updatedBy + ", addedDate="
				+ addedDate + ", upadatedDate=" + upadatedDate + "]";
	}

}
