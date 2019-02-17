package com.study.moneybook.domain;

import com.study.moneybook.repository.WorkEntity;

public class Work {
    private String id;
    private String money;
    private String type;
    private String paymentType;
    private String category;
    // 데이터 YYYYMMDDHHmm의 형태
    private String  dateTime;

    public Work() {}

    public Work(WorkEntity entity) {
        this.id = entity.getId();
        this.money = entity.getMoney();
        this.type = entity.getType().toString();
        this.paymentType = entity.getPaymentType().toString();
        this.category = entity.getCategory().getName(); // 굳이 category의 아이디를 가지고 있을 필요가 있을까?
        this.dateTime = entity.getDateTime();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
