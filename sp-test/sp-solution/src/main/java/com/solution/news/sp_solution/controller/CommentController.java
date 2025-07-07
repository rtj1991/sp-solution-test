package com.solution.news.sp_solution.controller;


import com.solution.news.sp_solution.dto.CommentDto;
import com.solution.news.sp_solution.entity.Comment;
import com.solution.news.sp_solution.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/news/{newsId}/comments")
public class CommentController {
    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommentDto> all(@PathVariable Long newsId) {
        return service.forNews(newsId).stream()
                .map(c -> CommentDto.builder()
                        .id(c.getId())
                        .author(c.getAuthor())
                        .body(c.getBody())
                        .createdAt(c.getCreatedAt())
                        .build())
                .collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity<CommentDto> add(@PathVariable Long newsId, @RequestBody CommentDto dto) {
        Comment saved = service.add(newsId, dto.getAuthor(), dto.getBody());
        CommentDto resp = CommentDto.builder()
                .id(saved.getId())
                .author(saved.getAuthor())
                .body(saved.getBody())
                .createdAt(saved.getCreatedAt())
                .build();
        return ResponseEntity.ok(resp);
    }
}
