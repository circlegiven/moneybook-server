package com.study.moneybook.controller;

import com.study.moneybook.service.CategoryService;
import com.study.moneybook.value.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Result getCategoryList() {
        Result result = new Result();
        result.setData(categoryService.getCategoryList());
        return result;
    }
}