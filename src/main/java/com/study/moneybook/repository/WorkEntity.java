package com.study.moneybook.repository;

import com.study.moneybook.domain.MoneyType;
import com.study.moneybook.domain.PaymentType;
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
    private Integer type;        // WorkType enum

    private Integer paymentType; // PaymentType enum

    private Integer moneyType;   // MoneyType enum

    @Temporal(TemporalType.TIMESTAMP)
    private Date targetTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;

    public WorkType getType() {
        return WorkType.getType(this.moneyType);
    }

    public void setType(WorkType type) {
        if (null == type) {
            this.type = null;
        } else {
            this.type = type.getId();
        }
    }

    public MoneyType getMoneyType() {
        return MoneyType.getType(this.moneyType);
    }

    public void setMoneyType(MoneyType type) {
        if (null == type) {
            this.moneyType = null;
        } else {
            this.moneyType = type.getId();
        }
    }

    public PaymentType getPaymentType() {
        return PaymentType.getType(this.paymentType);
    }

    public void setPaymentType(PaymentType type) {
        if (null == type) {
            this.paymentType = null;
        } else {
            this.paymentType = type.getId();
        }
    }
}
