package com.study.moneybook.repository;

import com.study.moneybook.domain.PaymentType;
import com.study.moneybook.domain.WorkType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "tb_work")
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

    @Column(name = "payment_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @ManyToOne(targetEntity = CategoryEntity.class)
    @JoinColumn(name = "category")
    private CategoryEntity category;

    @Column(name = "time", nullable = false)    // 데이터 YYYYMMDDHHmm의 형태
    private String  time;

}
