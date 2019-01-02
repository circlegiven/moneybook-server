package com.study.moneybook.repository;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "work")
public class WorkEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(targetEntity = WorkTypeEntity.class)
    private WorkTypeEntity type;

    @ManyToOne(targetEntity = PaymentTypeEntity.class)
    private PaymentTypeEntity paymentType;

    @ManyToOne(targetEntity = MoneyTypeEntity.class)
    private MoneyTypeEntity moneyType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date targetTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;
}
