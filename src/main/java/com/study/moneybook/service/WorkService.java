package com.study.moneybook.service;

import com.study.moneybook.repository.WorkRepository;
import com.study.moneybook.value.CalenderValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WorkService {

    @Autowired
    WorkRepository workRepository;

    public List<CalenderValue> getWorkList(Date date) {

    }
}
