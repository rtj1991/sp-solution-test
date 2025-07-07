package com.solution.news.sp_solution.repository;

import com.solution.news.sp_solution.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
