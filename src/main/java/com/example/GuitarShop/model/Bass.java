package com.example.GuitarShop.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Bass")
@DiscriminatorValue("BG")
public class Bass extends Guitar {

	public Bass() {
		
	}
}
