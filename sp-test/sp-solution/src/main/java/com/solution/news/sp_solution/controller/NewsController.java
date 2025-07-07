package com.solution.news.sp_solution.controller;

import com.solution.news.sp_solution.dto.NewsDto;
import com.solution.news.sp_solution.entity.News;
import com.solution.news.sp_solution.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/news")
public class NewsController {
    private final NewsService service;

    public NewsController(NewsService service) {
        this.service = service;
    }

    @GetMapping("/category/{catId}")
    public List<NewsDto> byCategory(@PathVariable Long catId){
        return service.byCategory(catId).stream()
                .map(n -> NewsDto.builder()
                        .id(n.getId())
                        .title(n.getTitle())
                        .publishedAt(n.getPublishedAt())
                        .categories(n.getCategories().stream().map(Category::getName).toList())
                        .build())
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public NewsDto single(@PathVariable Long id){
        News n = service.find(id);
        return NewsDto.builder()
                .id(n.getId())
                .title(n.getTitle())
                .publishedAt(n.getPublishedAt())
                .categories(n.getCategories().stream().map(Category::getName).toList())
                .build();
    }
}
