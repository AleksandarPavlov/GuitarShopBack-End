package com.example.GuitarShop.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="AcousticGuitar")
@DiscriminatorValue("AG")
public class AcousticGuitar extends Guitar {

	public AcousticGuitar() {
	}
}
