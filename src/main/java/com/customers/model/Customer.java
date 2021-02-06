package com.customers.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
@EntityListeners(AuditingEntityListener.class)
public class Customer {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "CUSTOMER_ID", nullable = false)
	private long customer_id;

	@Column(name = "NAME", nullable = false)
	private String name;

	private enum Gender{
		MALE,FEMALE
	}

	@Column(name = "GENDER", nullable = false)
	private Gender gender;

	@Column(name = "EMAIL_ADDRESS", nullable = false)
	private String email_address;

	@Column(name = "MOBILE_NUMBER", nullable = false)
	private String mobile_number;

	@Column(name = "ADDRESS_LINE_1", nullable = false)
	private String address_line_1;

	@Column(name = "ADDRESS_LINE_2", nullable = false)
	private String address_line_2;

	@Column(name = "STATE", nullable = false)
	private String state;

	@Column(name = "CITY", nullable = false)
	private String city;

	@Column(name = "ZIPCODE", nullable = false)
	private int zipcode;

	@Column(name = "COUNTRY", nullable = false)
	private String country;

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getAddress_line_1() {
		return address_line_1;
	}

	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}

	public String getAddress_line_2() {
		return address_line_2;
	}

	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", gender=" + gender + ", email_address="
				+ email_address + ", mobile_number=" + mobile_number + ", address_line_1=" + address_line_1
				+ ", address_line_2=" + address_line_2 + ", state=" + state + ", city=" + city + ", zipcode=" + zipcode
				+ ", country=" + country + "]";
	}
}
