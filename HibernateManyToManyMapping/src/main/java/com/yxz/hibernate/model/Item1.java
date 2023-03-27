package com.yxz.hibernate.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ITEM")
public class Item1 {

	@Id
	@Column(name="item_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="item_price")
	private double price;
	
	@Column(name="item_desc")
	private String description;
	
	@Transient
    private Timestamp TimeStamp;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Transient
	public String getTimeStamp() {
		TimeStamp = new Timestamp(System.currentTimeMillis());
		return TimeStamp.toGMTString();
	}
	@Transient
	public void setTimeStamp() {
		this.TimeStamp = new Timestamp(System.currentTimeMillis());
	}
}
