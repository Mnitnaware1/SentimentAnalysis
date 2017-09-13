package sa.main.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_review_type")
public class Review {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "review_name")
	private String reviewName;

	@Column(name = "review_type")
	private String reviewType;

	@Column(name = "max_range")
	private int maxRange;

	@Column(name = "min_range")
	private int minRange;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "added_by")
	private int addedBy;

	@Column(name = "updated_by")
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

	public String getReviewName() {
		return reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public String getReviewType() {
		return reviewType;
	}

	public void setReviewType(String reviewType) {
		this.reviewType = reviewType;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
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
		return "Review [id=" + id + ", reviewName=" + reviewName + ", reviewType=" + reviewType + ", maxRange="
				+ maxRange + ", minRange=" + minRange + ", isActive=" + isActive + ", addedBy=" + addedBy
				+ ", updatedBy=" + updatedBy + ", addedDate=" + addedDate + ", upadatedDate=" + upadatedDate + "]";
	}

}
