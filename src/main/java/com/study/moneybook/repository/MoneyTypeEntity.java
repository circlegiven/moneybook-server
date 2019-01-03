package com.study.moneybook.repository;

import javax.persistence.*;

@Entity
@Table(name = "money_type")
public class MoneyTypeEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
