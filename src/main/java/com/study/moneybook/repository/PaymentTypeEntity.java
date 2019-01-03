package com.study.moneybook.repository;

import com.study.moneybook.domain.WorkType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "payment_type")
public class PaymentTypeEntity implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private WorkType workType;


    public String getName() {
        return name;
    }

    public WorkType getWorkType() {
        return workType;
    }
}
