package com.example.GuitarShop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.example.GuitarShop.model.Guitar;
import com.example.GuitarShop.model.GuitarType;



@Repository
public interface GuitarRepository extends JpaRepository<Guitar, Long> {

	List<Guitar> findByGuitarType(Enum<GuitarType> type);
}
