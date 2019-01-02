package com.study.moneybook.service;

import com.study.moneybook.domain.PaymentType;
import com.study.moneybook.repository.PaymentTypeEntity;
import com.study.moneybook.repository.PaymentTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PaymentTypeService {

    private PaymentTypeRepository paymentTypeRepository;

    public List<PaymentType> findAll() {
        Iterable<PaymentTypeEntity> sampleList = paymentTypeRepository.findAll();
        List<PaymentType> resultList = new ArrayList<>();
        sampleList.iterator().forEachRemaining(value -> resultList.add(new PaymentType(value.getId(), value.getName())));
        return resultList;
    }
}
