package com.study.moneybook.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


// 지불 방법
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PaymentType {

    private String name;

    private WorkType workType;

    public PaymentType(String name, WorkType workType) {
        this.name = name;
        this.workType = workType;
    }
}
