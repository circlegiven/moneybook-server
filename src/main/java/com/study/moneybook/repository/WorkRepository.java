package com.study.moneybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface WorkRepository extends JpaRepository<WorkEntity, String> {
    List<WorkEntity> findWorkEntitiesByTargetTime(Date date);
}
