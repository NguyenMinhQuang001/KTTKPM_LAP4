package com.example.QuanLyChuyenBayJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuanLyChuyenBayJPA.repository.ChuyenBayRepository;
import com.example.QuanLyChuyenBayJPA.entity.ChuyenBay;


@RestController
public class QuanLyChuyenBayController {
	@Autowired
	ChuyenBayRepository chuyenBayRepository;
	
	@GetMapping("/didalat")
	public List<ChuyenBay> findChuyenBaysDaLat(){
		return chuyenBayRepository.findChuyenBaysDaLat();
	}
	
}
