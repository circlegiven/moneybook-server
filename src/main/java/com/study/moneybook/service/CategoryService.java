package com.study.moneybook.service;

import com.study.moneybook.domain.Category;
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
        originList.iterator().forEachRemaining(value -> resultList.add(new Category(value.getName(), value.getWorkType())));
        return resultList;
    }

    public Category getCategory(String name) {
        CategoryEntity categoryEntity = categoryRepository.findCategoryByName(name);
        Category result = null;
        if (null != categoryEntity) {
            result = new Category(categoryEntity.getName(), categoryEntity.getWorkType());
        }
        return result;
    }
}
