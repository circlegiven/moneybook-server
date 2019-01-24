package com.study.moneybook.service;

import com.study.moneybook.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WorkService {

    @Autowired
    WorkRepository workRepository;

//    public List<CalenderValue> getWorkList(Date date) {
//
//    }
}
