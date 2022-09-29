package com.example.QuanLyChuyenBayJPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.QuanLyChuyenBayJPA.entity.ChuyenBay;
import com.example.QuanLyChuyenBayJPA.repository.ChuyenBayRepository;

@SpringBootTest
class QuanLyChuyenBayJpaApplicationTests {
	@Autowired
	ChuyenBayRepository chuyenBayRepository;

	@Test
    void cau1() {
        List<ChuyenBay> chuyenBays ;

        chuyenBays = chuyenBayRepository.findChuyenBaysDaLat();
        for (ChuyenBay chuyenBay : chuyenBays) {
            System.out.println(chuyenBay);
        }
    }

}
