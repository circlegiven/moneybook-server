package com.study.moneybook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, String> {
    CategoryEntity findByName(String name);

    @Override
    <S extends CategoryEntity> S save(S s);
}
