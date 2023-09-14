package me.kimhoongyu.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.kimhoongyu.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long>{

}
