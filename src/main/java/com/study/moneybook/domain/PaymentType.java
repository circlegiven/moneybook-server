package com.study.moneybook.domain;

// 지불 방법
public class PaymentType {

    private Long id;

    private String name;

    public PaymentType(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
