package com.solution.news.sp_solution.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CategoryDto {
    private Long id;
    private String name;
}
