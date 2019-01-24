package com.study.moneybook.value;

import java.util.Date;
import java.util.List;

public class CalenderValue {
    private Date dateTime;
    private List<WorkValue> workList;

    public CalenderValue(Date dateTime, List<WorkValue> workList) {
        this.dateTime = dateTime;
        this.workList = workList;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public List<WorkValue> getWorkList() {
        return workList;
    }

    public void setWorkList(List<WorkValue> workList) {
        this.workList = workList;
    }
}
