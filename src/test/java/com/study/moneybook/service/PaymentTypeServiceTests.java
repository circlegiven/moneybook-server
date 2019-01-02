package com.study.moneybook.service;

import com.study.moneybook.domain.PaymentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentTypeServiceTests {

    @Autowired
    private PaymentTypeService paymentTypeService;

    @Test
    public void findALL() {
        List<PaymentType> list = paymentTypeService.findAll();
        System.out.println(list.toString());
    }

}
