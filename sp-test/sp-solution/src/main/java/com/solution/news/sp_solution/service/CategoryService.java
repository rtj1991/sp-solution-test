package com.solution.news.sp_solution.service;

import com.solution.news.sp_solution.entity.Category;
import com.solution.news.sp_solution.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository repo;

    public CategoryService(CategoryRepository repo) {
        this.repo = repo;
    }

    public List<Category> all() { return repo.findAll(); }
}
