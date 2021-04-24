package com.leyou.item.controller;

import com.leyou.item.dto.CategoryDTO;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Haiqiao
 * @version 1.0
 * @date 2021/4/24 7:28
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("of/parent")
    public ResponseEntity<List<CategoryDTO>>queryCategoryByParentId(@RequestParam("pid")Long pid){
        return ResponseEntity.ok(this.categoryService.queryCategoryByParentId(pid));

    }


}
