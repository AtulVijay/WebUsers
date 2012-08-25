package com.atul.webusers.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="CUSTOMER_DETAILS")
public class CustomerDetails {

	
	private Long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private Long mobile;
	private Long stdCode;
	private Long phone;
	private String email;
	private String altEmail;
	private String address1;
	private String address2;
	private String area;
	private String city;
	private String state;
	private Long pinCode;
	
	@Id
	@TableGenerator(name="customerid", table="CUSTOMER_DETAILS_PK", pkColumnName="customerid_pk_name",
	pkColumnValue="customerid_pk_value", initialValue=000000001, allocationSize=1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator="customerid")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="FIRSTNAME", length=30, nullable=false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name="LASTNAME", length=30, nullable=false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name="MIDDLENAME", length=30, nullable=true)
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Column(name="MOBILE", length=10, nullable=false)
	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Column(name="STDCODE", length=7, nullable=true)
	public Long getStdCode() {
		return stdCode;
	}

	public void setStdCode(Long stdCode) {
		this.stdCode = stdCode;
	}

	@Column(name="PHONE", length=8, nullable=true)
	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Column(name="EMAIL", length=80, nullable=false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="ALTEMAIL", length=80, nullable=true)
	public String getAltEmail() {
		return altEmail;
	}

	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}

	@Column(name="ADDRESS1", length=200, nullable=false)
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name="ADDRESS2", length=200, nullable=false)
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name="AREA", length=200, nullable=false)
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Column(name="CITY", length=100, nullable=false)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name="STATE", length=50, nullable=false)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Column(name="PINCODE", length=6, nullable=false)
	public Long getPinCode() {
		return pinCode;
	}

	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
	
			
}
