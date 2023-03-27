package com.yxz.hibernate.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CART")
public class Cart1 {

	@Id
	@Column(name = "cart_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "cart_total")
	private double total;

	@ManyToMany(targetEntity = Item1.class, cascade = { CascadeType.ALL })
	@JoinTable(name = "CART_ITEMS", 
				joinColumns = { @JoinColumn(name = "cart_id") }, 
				inverseJoinColumns = { @JoinColumn(name = "item_id") })
	private Set<Item1> items;
	
	@Column(name = "time_stamp")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Embedded
	private Name name;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Item1> getItems() {
		return items;
	}

	public void setItems(Set<Item1> items) {
		this.items = items;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}
	
	public Cart1() {
			
	}
	
	public Cart1(long id, double total, Set<Item1> items, Name name) {
		this.id = id;
		this.total = total;
		this.items = items;
		this.name = name;
	}
}
