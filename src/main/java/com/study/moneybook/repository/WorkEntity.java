package com.study.moneybook.repository;

import com.study.moneybook.domain.WorkType;
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

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private WorkType type;

    @ManyToOne(targetEntity = PaymentTypeEntity.class)
    @JoinColumn(name = "payment_type_id")
    private PaymentTypeEntity paymentType;

    @ManyToOne(targetEntity = MoneyTypeEntity.class)
    @JoinColumn(name = "money_type_id")
    private MoneyTypeEntity moneyType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date targetTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;



}
