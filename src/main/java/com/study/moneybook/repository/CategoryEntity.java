package com.study.moneybook.repository;

import com.study.moneybook.domain.PaymentType;
import com.study.moneybook.domain.WorkType;

import javax.persistence.*;

@Entity
@Table(name = "tb_category")
public class CategoryEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private WorkType workType;
}