package com.example.GuitarShop.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GuitarShop.dto.CreateGuitarDTO;
import com.example.GuitarShop.model.Guitar;
import com.example.GuitarShop.repository.GuitarRepository;
import com.example.GuitarShop.service.GuitarService;





@RestController
@RequestMapping("guitars")
public class GuitarController {
	
	
	@Autowired
	private GuitarRepository guitarRepository;
	
	@Autowired
	private GuitarService guitarService;

	
	@PostMapping(value = "/",consumes = "application/json")
    public  ResponseEntity<CreateGuitarDTO> SaveGuitar(@RequestBody CreateGuitarDTO  createGuitarDTO){

    	 Guitar createdGuitar = guitarService.createGuitar(createGuitarDTO);
    	 return new ResponseEntity<>(createGuitarDTO, HttpStatus.CREATED);

 
          
    }
	
	 
	 @GetMapping(value = "/all")
	    public ResponseEntity<List<Guitar>> getAll(){
	        return new ResponseEntity<>(guitarService.findAll(), HttpStatus.OK);
	    }
	 
	 @GetMapping(value = "/electric")
	    public ResponseEntity<List<Guitar>> getElectricGuitars(){
	        return new ResponseEntity<>(guitarService.findElectricGuitars(), HttpStatus.OK);
	    }
	
	 @GetMapping(value = "/acoustic")
	    public ResponseEntity<List<Guitar>> getAcousticGuitars(){
	        return new ResponseEntity<>(guitarService.findAcousticGuitars(), HttpStatus.OK);
	    }
	 
	 @GetMapping(value = "/bass")
	    public ResponseEntity<List<Guitar>> getBassGuitars(){
	        return new ResponseEntity<>(guitarService.findBassGuitars(), HttpStatus.OK);
	    }
	 
	 @GetMapping(value = "/{id}")
	    public ResponseEntity<Guitar> getOneGuitar(@PathVariable String id){
		
	        return new ResponseEntity<>(guitarService.findOneGuitar(id), HttpStatus.OK);
	    }
}
