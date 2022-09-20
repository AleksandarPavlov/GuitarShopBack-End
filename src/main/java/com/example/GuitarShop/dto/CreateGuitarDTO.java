package com.example.GuitarShop.dto;

import com.example.GuitarShop.model.Guitar;

public class CreateGuitarDTO {

	private String Brand;
	private String Model;
	private int Price;
	private String Neck;
	private String GuitarType;
	private String Image;
	private String SliderImage;
	
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
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
	public String getNeck() {
		return Neck;
	}
	public void setNeck(String neck) {
		Neck = neck;
	}
	public String getGuitarType() {
		return GuitarType;
	}
	public void setGuitarType(String guitarType) {
		GuitarType = guitarType;
	}
	
	public String getSliderImage() {
		return SliderImage;
	}
	public void setSliderImage(String sliderImage) {
		SliderImage = sliderImage;
	}
	public CreateGuitarDTO(String brand, String model, int price, String neck, String guitarType, String image, String sliderImage) {
		super();
		Brand = brand;
		Model = model;
		Price = price;
		Neck = neck;
		GuitarType = guitarType;
		Image = image;
		SliderImage = sliderImage;
	}
	
	public CreateGuitarDTO() {
		
	}
	
	 public CreateGuitarDTO(Guitar createdGuitar) {
		 this.Brand = createdGuitar.getBrand();
	        this.GuitarType = createdGuitar.getGuitarType().toString();
	        this.Model = createdGuitar.getModel();
	        this.Neck = createdGuitar.getNeck().toString();
	        this.Price = createdGuitar.getPrice();
	        this.Image = createdGuitar.getImage();
	        this.SliderImage = createdGuitar.getSliderImage();
	    }
}
