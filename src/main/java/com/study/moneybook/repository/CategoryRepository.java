package com.study.moneybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, String> {
    CategoryEntity findCategoryByName(String name);

    @Override
    <S extends CategoryEntity> S save(S s);
}
