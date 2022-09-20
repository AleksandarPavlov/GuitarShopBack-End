package com.example.GuitarShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GuitarShop.dto.CreateGuitarDTO;
import com.example.GuitarShop.model.Guitar;
import com.example.GuitarShop.model.GuitarType;
import com.example.GuitarShop.model.NeckType;
import com.example.GuitarShop.repository.GuitarRepository;

@Service
public class GuitarServiceImplement implements GuitarService {

	@Autowired
	private GuitarRepository guitarRepository;
	
	@Override
	public Guitar createGuitar(CreateGuitarDTO createGuitarDTO) {
		
		Guitar x = new Guitar();
		x.setAvailable(true);
		x.setBrand(createGuitarDTO.getBrand());
		x.setGuitarType(GuitarType.valueOf(createGuitarDTO.getGuitarType()));
		x.setModel(createGuitarDTO.getModel());
		x.setNeck(NeckType.valueOf(createGuitarDTO.getNeck()));
		x.setPrice(createGuitarDTO.getPrice());
		x.setImage(createGuitarDTO.getImage());
		x.setSliderImage(createGuitarDTO.getSliderImage());
		x = guitarRepository.save(x);
		return x;
	}

	@Override
	public List<Guitar> findAll() {
		return guitarRepository.findAll();
	}

	@Override
	public List<Guitar> findElectricGuitars() {
		
		return guitarRepository.findByGuitarType(GuitarType.ElectricGuitar);
	}

	@Override
	public List<Guitar> findAcousticGuitars() {
		return guitarRepository.findByGuitarType(GuitarType.AcousticGuitar);
	}

	@Override
	public List<Guitar> findBassGuitars() {
		return guitarRepository.findByGuitarType(GuitarType.Bass);
	}

	@Override
	public Guitar findOneGuitar(String id) {
		return guitarRepository.findById(Long.parseLong(id)).orElseGet(null);
	}

}
