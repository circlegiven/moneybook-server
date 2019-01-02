package com.study.moneybook.controller;

import com.study.moneybook.domain.PaymentType;
import com.study.moneybook.service.PaymentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/payment")
public class PaymentTypeController {

    @Autowired
    private PaymentTypeService paymentTypeService;

    @RequestMapping(value = "/all", method= RequestMethod.GET)
    public @ResponseBody List<PaymentType> paymentTypeList() {
        return paymentTypeService.findAll();
    }
}
