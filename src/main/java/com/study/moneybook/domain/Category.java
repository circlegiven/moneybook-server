package com.study.moneybook.domain;

import com.study.moneybook.repository.CategoryEntity;

import java.io.Serializable;

public class Category implements Serializable {

    private String name;

    private WorkType workType;

    public Category(CategoryEntity entity) {
        this.name = entity.getName();
        this.workType = entity.getWorkType();
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
