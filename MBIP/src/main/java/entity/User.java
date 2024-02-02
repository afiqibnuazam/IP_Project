package entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	
	//Login Details
	@Column(name = "email", unique = true, nullable = false)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "role", nullable = false)
	private String role; // "PARTICIPANT" or "ADMIN"
	
	
	//Personal Details
	@Column(name = "fullName")
	private String fullName;
	
	@Column(name = "icNumber", unique = true)
	private String icNumber;
	
	@Column(name = "phoneNumber", unique = true)
	private String phoneNumber;
	
	@Column(name = "status")
	private String status; // Working, Student, Housewife, Others...
	
	@Column(name = "institutionName")
	private String institutionName;
	
	@Column(name = "institutionType")
	private String institutionType; // Public or Private Sector
	
	@Column(name = "category")
	private String category; // A1:Housing (high rise), A2:Housing (landed), B:Institution, C:MBIP Staff
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "householdSize")
	private int householdSize;
	
	
	@CreationTimestamp
	@Column(name = "createdOn")
	private LocalDateTime createdOn;
	@UpdateTimestamp
	@Column(name = "updatedOn")
	private LocalDateTime updatedOn;
	
	
	//Relationships
	@OneToMany(mappedBy = "user")
    private List<RecycleActivity> recycleActivities;
	
	
}
