package com.example.GuitarShop.model;

import static javax.persistence.DiscriminatorType.STRING;
import static javax.persistence.InheritanceType.SINGLE_TABLE;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;



@Entity
@Inheritance(strategy=SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType=STRING)
@DiscriminatorValue("GU")
public class Guitar {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name="Brand", unique=false, nullable=false)
	private String Brand;
	
	@Column(name="Model", unique=false, nullable=false)
	private String Model;
	
	@Column(name="Price", unique=false, nullable=false)
	private int Price;
	
	@Column(name="Image", unique=false, nullable=false)
	private String Image;
	
	@Column(name="SliderImage", unique=false, nullable=false)
	private String SliderImage;

	@Enumerated(EnumType.STRING)
	private NeckType Neck;
	
	@Enumerated(EnumType.STRING)
	private GuitarType guitarType;
	

	@Column(name="Available", unique=false, nullable=false)
	private boolean Available;
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public NeckType getNeck() {
		return Neck;
	}

	public void setNeck(NeckType neck) {
		Neck = neck;
	}

	public boolean isAvailable() {
		return Available;
	}

	public void setAvailable(boolean available) {
		Available = available;
	}
	
	public GuitarType getGuitarType() {
		return guitarType;
	}

	public void setGuitarType(GuitarType guitarType) {
		guitarType = guitarType;
	}
	
	public String getSliderImage() {
		return SliderImage;
	}

	public void setSliderImage(String sliderImage) {
		SliderImage = sliderImage;
	}
	
	public Guitar() {
		
	}
	
	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public Guitar(Long id, String brand, String model, int price, NeckType neck, GuitarType guitarType, String image, boolean available) {
		Id = id;
		Brand = brand;
		Model = model;
		Price = price;
		Neck = neck;
		this.guitarType = guitarType;
		Available = available;
		Image = image;
	}

	

}
