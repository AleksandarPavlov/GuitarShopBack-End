package com.example.GuitarShop.service;

import java.util.List;

import com.example.GuitarShop.dto.CreateGuitarDTO;
import com.example.GuitarShop.model.Guitar;

public interface GuitarService {

	public Guitar createGuitar(CreateGuitarDTO createGuitarDTO);
	public List<Guitar> findAll();
	public List<Guitar> findElectricGuitars();
	public List<Guitar> findAcousticGuitars();
	public List<Guitar> findBassGuitars();
	public Guitar findOneGuitar(String id);
}
