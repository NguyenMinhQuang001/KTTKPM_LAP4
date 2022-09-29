package com.example.QuanLyChuyenBayJPA;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.QuanLyChuyenBayJPA.entity.ChuyenBay;
import com.example.QuanLyChuyenBayJPA.entity.MayBay;
import com.example.QuanLyChuyenBayJPA.repository.ChuyenBayRepository;
import com.example.QuanLyChuyenBayJPA.repository.MayBayRepository;

@SpringBootTest
class QuanLyChuyenBayJpaApplicationTests {
	@Autowired
	ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	MayBayRepository mayBayRepository;
	
//	1.	Cho biết các chuyến bay đi Đà Lạt (DAD).
//	@Test
//    void cau1() {
//        List<ChuyenBay> chuyenBays ;
//        chuyenBays = chuyenBayRepository.findChuyenBaysDaLat();
//        for (ChuyenBay chuyenBay : chuyenBays) {
//            System.out.println(chuyenBay);
//        }
//    }

//	2.	Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@Test
    void cau2() {
        List<MayBay> mayBays ;
        mayBays = mayBayRepository.findMayBayTamBayLH10000();
        for (MayBay mb : mayBays) {
            System.out.println(mb);
        }
    }
	
	

}
