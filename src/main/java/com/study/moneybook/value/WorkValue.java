package com.study.moneybook.value;

import com.study.moneybook.domain.WorkType;

import java.util.Date;

public class WorkValue {
    private Date date;
    private WorkType workType;
    private String category;
    private Integer money;

    public WorkValue(Date date, WorkType workType, String category, Integer money) {
        this.date = date;
        this.workType = workType;
        this.category = category;
        this.money = money;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
