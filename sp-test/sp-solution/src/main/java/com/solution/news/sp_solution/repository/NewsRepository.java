package com.solution.news.sp_solution.repository;

import com.solution.news.sp_solution.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findByCategories_Id(Long categoryId);
}
