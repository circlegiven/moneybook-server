package com.study.moneybook.domain;

// 지불 방법
public enum PaymentType {
    CREADIT(1),    // 카드
    CASH(2);       // 현금

    private int id;

    private PaymentType(int id) {
        this.id = id;
    }

    public static PaymentType getType(Integer id) {
        if (null == id) {
            return null;
        }

        for (PaymentType type: PaymentType.values()) {
            if (id.equals(type.getId())) {
                return type;
            }
        }
        throw new IllegalArgumentException("매칭되는 타입이 없습니다 : " + id);
    }

    public int getId() {
        return id;
    }
}
