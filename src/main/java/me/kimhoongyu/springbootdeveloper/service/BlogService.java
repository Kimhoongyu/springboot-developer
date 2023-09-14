package me.kimhoongyu.springbootdeveloper.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import me.kimhoongyu.springbootdeveloper.domain.Article;
import me.kimhoongyu.springbootdeveloper.dto.AddArticleRequest;
import me.kimhoongyu.springbootdeveloper.repository.BlogRepository;

@RequiredArgsConstructor
@Service
public class BlogService {

	private final BlogRepository blogRepository;
	
	public Article save(AddArticleRequest request) {
		return blogRepository.save(request.toEntity());
	}
	
	public List<Article> findAll(){
		return blogRepository.findAll();
	}
}
