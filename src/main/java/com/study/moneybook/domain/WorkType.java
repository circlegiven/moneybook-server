package com.study.moneybook.domain;

public enum WorkType {
    PROFIT(1),  // 수입
    EXPENSE(2); // 지출

    private int id;

    private WorkType(Integer id) {
        this.id = id;
    }

    public static WorkType getType(Integer id) {
        if (null == id) {
            return null;
        }

        for (WorkType type: WorkType.values()) {
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