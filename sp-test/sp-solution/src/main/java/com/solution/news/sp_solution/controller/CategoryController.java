package com.solution.news.sp_solution.controller;

import com.solution.news.sp_solution.dto.CategoryDto;
import com.solution.news.sp_solution.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {
    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<CategoryDto> all(){
        return service.all().stream()
                .map(c -> CategoryDto.builder().id(c.getId()).name(c.getName()).build())
                .collect(Collectors.toList());
    }
}
