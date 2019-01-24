package com.study.moneybook.domain;

import java.io.Serializable;

public class Category implements Serializable {

    private String name;

    private WorkType workType;

    public Category(String name, WorkType workType) {
        this.name = name;
        this.workType = workType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }
}
