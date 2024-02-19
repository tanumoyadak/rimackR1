package com.rad.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private String id;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONENO")
	private Long phoneNo;
	
	@Column(name = "NAME")
	private String Name;
	
	@Column(name = "ID")
	private Date createdDate;
	
	@Column(name = "ID")
	private String createdByName;
	
	@Column(name = "ID")
	private Date modifiedDate;
	
	@Column(name = "ID")
	private String modifiedByName;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the createdByName
	 */
	public String getCreatedByName() {
		return createdByName;
	}

	/**
	 * @param createdByName the createdByName to set
	 */
	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the modifiedByName
	 */
	public String getModifiedByName() {
		return modifiedByName;
	}

	/**
	 * @param modifiedByName the modifiedByName to set
	 */
	public void setModifiedByName(String modifiedByName) {
		this.modifiedByName = modifiedByName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phoneNo=");
		builder.append(phoneNo);
		builder.append(", Name=");
		builder.append(Name);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", createdByName=");
		builder.append(createdByName);
		builder.append(", modifiedDate=");
		builder.append(modifiedDate);
		builder.append(", modifiedByName=");
		builder.append(modifiedByName);
		builder.append("]");
		return builder.toString();
	}


}
