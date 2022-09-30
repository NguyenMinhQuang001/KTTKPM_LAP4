package com.example.QuanLyChuyenBayJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.QuanLyChuyenBayJPA.entity.ChuyenBay;
import com.example.QuanLyChuyenBayJPA.entity.MayBay;
import com.example.QuanLyChuyenBayJPA.repository.ChuyenBayRepository;
import com.example.QuanLyChuyenBayJPA.repository.MayBayRepository;


@RestController
public class QuanLyChuyenBayController {
	@Autowired
	ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	MayBayRepository mayBayRepository;
	
	@GetMapping("/didalat")
	public List<ChuyenBay> findChuyenBaysDaLat(){
		return chuyenBayRepository.findChuyenBaysDaLat();
	}
	
	@GetMapping("/cau2")
	public List<MayBay> findMayBayTamBayLH10000(){
		return mayBayRepository.findMayBayTamBayLH10000();
	}
	
	
	
}
