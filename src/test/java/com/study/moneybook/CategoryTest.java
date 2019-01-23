package com.study.moneybook;

import com.study.moneybook.domain.Category;
import com.study.moneybook.domain.WorkType;
import com.study.moneybook.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryTest {
    @Autowired
    CategoryService categoryService;

    @Test
    public void getCategoryList() {
        List<Category> result = categoryService.getCategoryList();
        System.out.println(result);
    }

    @Test
    public void getCategoryOfExist() {
        Category result = categoryService.getCategory("급여");
        System.out.println(result);
    }

    @Test
    public void getCategoryOfNotExist() {
        Category result = categoryService.getCategory("테스트");
        System.out.println(result);
    }

    @Test
    public void createCategory() {
        Category result = categoryService.createCategory("통신비", WorkType.EXPENSE);
        System.out.println(result);
    }
}
