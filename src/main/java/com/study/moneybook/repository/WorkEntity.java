package com.study.moneybook.repository;

import com.study.moneybook.domain.PaymentType;
import com.study.moneybook.domain.WorkType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_work")
public class WorkEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "money", nullable = false)
    private String money;

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private WorkType type;

    @Column(name = "payment_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @ManyToOne(targetEntity = CategoryEntity.class)
    @JoinColumn(name = "category")
    private CategoryEntity category;

    @Column(name = "comment")
    private String comment;

    @Column(name = "target_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date targetTime;

    @Column(name = "group_time")
    private Date groupTime;
}
