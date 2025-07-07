package com.solution.news.sp_solution.service;

import com.solution.news.sp_solution.entity.Comment;
import com.solution.news.sp_solution.entity.News;
import com.solution.news.sp_solution.repository.CommentRepository;
import com.solution.news.sp_solution.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository repo;
    private final NewsRepository newsRepo;

    public CommentService(CommentRepository repo, NewsRepository newsRepo) {
        this.repo = repo;
        this.newsRepo = newsRepo;
    }

    public List<Comment> forNews(Long newsId){ return repo.findByNewsId(newsId); }
    public Comment add(Long newsId, String author, String body){
        News news = newsRepo.findById(newsId).orElseThrow();
        Comment c = Comment.builder()
                .author(author)
                .body(body)
                .createdAt(java.time.LocalDateTime.now())
                .news(news)
                .build();
        return repo.save(c);
    }
}
