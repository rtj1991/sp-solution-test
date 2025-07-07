package com.solution.news.sp_solution.service;

import com.solution.news.sp_solution.entity.News;
import com.solution.news.sp_solution.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final NewsRepository repo;

    public NewsService(NewsRepository repo) {
        this.repo = repo;
    }

    public List<News> byCategory(Long catId) { return repo.findByCategories_Id(catId); }
    public News find(Long id) { return repo.findById(id).orElseThrow(); }
}
