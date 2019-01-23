package com.study.moneybook.value;

import java.io.Serializable;

// TODO Serializable을 왜 구현하는가?
public class Result implements Serializable {

    protected Integer code;

    protected String message;

    protected Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
