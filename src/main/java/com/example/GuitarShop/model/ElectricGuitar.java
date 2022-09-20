package com.example.GuitarShop.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ElectricGuitar")
@DiscriminatorValue("EG")
public class ElectricGuitar extends Guitar{

	public ElectricGuitar() {
		
	}
}
