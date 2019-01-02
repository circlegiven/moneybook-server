package com.study.moneybook.domain;

public enum  MoneyType {
    SALARY(1),                 // 월급
    REIMBURSEMENT(2),          // 환급
    ALLOWANCE(3),              // 용돈
    FOOD_EXPENSE(4),           // 식비
    TRANSPORT_EXPENSE(5),      // 교통비
    COMMUTE_EXPENSE(6),        // 통신비
    LIVING_EXPENSE(7),         // 생활비
    UTILITY_CHARGE(8),         // 공과금
    CULTURAL_EXPENSE(9),       // 문화비
    MEDICAL_EXPENSE(10),        // 의료비
    INSURANCE_EXPENSE(11),      // 보험비
    SAVING(12),                 // 저축
    ETC(13);                    // 기타

    private int id;

    private MoneyType(int id) {
        this.id = id;
    }

    public static MoneyType getType(Integer id) {
        if (null == id) {
            return null;
        }

        for (MoneyType type: MoneyType.values()) {
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
