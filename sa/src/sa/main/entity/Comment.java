package sa.main.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_comment")
public class Comment {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "description")
	private String description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "Comment [id=" + id + ", description=" + description + ", addedBy=" + addedBy + ", updatedBy="
				+ updatedBy + ", addedDate=" + addedDate + ", upadatedDate=" + upadatedDate + "]";
	}

}
