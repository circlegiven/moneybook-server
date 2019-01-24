package com.study.moneybook.service;

import com.study.moneybook.domain.Category;
import com.study.moneybook.domain.WorkType;
import com.study.moneybook.repository.CategoryEntity;
import com.study.moneybook.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategoryList() {
        Iterable<CategoryEntity> originList = categoryRepository.findAll();
        List<Category> resultList = new ArrayList<>();
        originList.iterator().forEachRemaining(value -> resultList.add(new Category(value)));
        return resultList;
    }

    public Category getCategory(String name) {
        CategoryEntity categoryEntity = categoryRepository.findByName(name);
        Category result = null;
        if (null != categoryEntity) {
            result = new Category(categoryEntity);
        }
        return result;
    }

    public Category createCategory(String name, WorkType workType) {
        // 이미 없는 카테고리 라면
        if (null == getCategory(name)) {
            CategoryEntity entity = categoryRepository.save(new CategoryEntity(name, workType));
            Category result = null;
            if (null != entity) {
                result = new Category(entity);
            }
            return result;
        } else {
            return null;
        }
    }
}
