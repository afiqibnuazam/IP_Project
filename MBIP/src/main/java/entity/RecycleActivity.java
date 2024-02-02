package entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "Recycle_Activities")
public class RecycleActivity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "weight")
	private double weight;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "month")
	private String month;
	
	@Column(name = "photoUrl")
	private String photoUrl;
	
	@CreationTimestamp
	@Column(name = "createdOn")
	private LocalDateTime createdOn;
	@UpdateTimestamp
	@Column(name = "updatedOn")
	private LocalDateTime updatedOn;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public RecycleActivity() {
	}

	public RecycleActivity(String type, double weight, double amount, String month, String photoUrl) {
		this.type = type;
		this.weight = weight;
		this.amount = amount;
		this.month = month;
		this.photoUrl = photoUrl;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
	@Override
	public String toString() {
		return "Recycle_Activities [id=" 		+id 
							 	+", type=" 		+type
							 	+", weight=" 	+weight
							 	+", amount=" 	+amount
							 	+", month=" 	+month
							 	+", photoUrl=" 	+photoUrl
							 	+", createdOn=" +createdOn
							 	+", updatedOn=" +updatedOn;
	}
}
