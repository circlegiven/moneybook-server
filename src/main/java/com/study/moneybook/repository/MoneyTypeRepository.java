package com.study.moneybook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyTypeRepository extends CrudRepository<MoneyTypeEntity, Long> {
}