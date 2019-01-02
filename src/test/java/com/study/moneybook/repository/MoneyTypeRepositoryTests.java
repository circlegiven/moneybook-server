package com.study.moneybook.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MoneyTypeRepositoryTests {

    @Autowired
    MoneyTypeRepository moneyTypeRepository;

    @After
    public void 테이블_초기화() {
        moneyTypeRepository.deleteAll();
    }

    @Test
    public void 모든_워크_아이템조회() {
        moneyTypeRepository.findAll();
    }
}
