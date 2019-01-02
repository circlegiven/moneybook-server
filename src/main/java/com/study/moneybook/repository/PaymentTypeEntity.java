package com.study.moneybook.repository;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_TYPE")
public class PaymentTypeEntity {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
