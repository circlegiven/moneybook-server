package com.study.moneybook.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WorkRepository extends CrudRepository<WorkEntity, String> {
    List<WorkEntity> findByDateTimeStartingWith(String dateString);
}
