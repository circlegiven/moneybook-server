package com.study.moneybook.repository;

import com.study.moneybook.domain.PaymentType;
import com.study.moneybook.domain.WorkType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "tb_category")
public class CategoryEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    @Column(name = "work_type")
    @Enumerated(EnumType.STRING)
    private WorkType workType;

    public CategoryEntity() {

    }

    public CategoryEntity(String name, WorkType workType) {
        this.name = name;
        this.workType = workType;
    }

    public String getName() {
        return name;
    }

    public WorkType getWorkType() {
        return workType;
    }
}