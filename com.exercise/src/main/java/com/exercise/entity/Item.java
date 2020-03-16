package com.exercise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "exercise")
public class Item {
    @Column(name="item_id")
	private int itemId;
    @Column(name ="item_description")
	private String shortDescription;
    @Column(name ="item_price")
	private int price;
    @Column(name="item_brand")
	private String brand;
	
	

	public int getItemId() {
		return itemId;
	}



	public void setItemId(int itemId) {
		this.itemId = itemId;
	}



	public String getShortDescription() {
		return shortDescription;
	}



	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public static void main(String[] args) {
		

	}

}
