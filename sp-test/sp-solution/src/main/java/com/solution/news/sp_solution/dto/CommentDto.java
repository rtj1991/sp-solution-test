package com.solution.news.sp_solution.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class CommentDto {
    private Long id;
    private String author;
    private String body;
    private LocalDateTime createdAt;
}
