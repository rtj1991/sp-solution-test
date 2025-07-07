package com.solution.news.sp_solution.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
public class NewsDto {
    private Long id;
    private String title;
    private LocalDateTime publishedAt;
    private List<String> categories;
}
