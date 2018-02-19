package com.afuentes.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.afuentes.models.Post;
import com.afuentes.models.PostLanguage;
import com.afuentes.repository.PostLanguageRepository;
import com.afuentes.repository.PostRespository;
import com.afuentes.services.IPostService;

@Service
public class PostServiceImpl implements IPostService {
	
	@Autowired
	private PostRespository postRepository;
	
	@Autowired
	private PostLanguageRepository postLanguageRepository;

	@Override
	public Post getPostById(Long idPost) {
		return this.postRepository.findOne(idPost);
	}

	@Override
	public List <Post> getAllPostByLanguageOrderByDate() {
		return this.postRepository.findAllByOrderByPostDateDesc();
	}

	@Override
	public PostLanguage getPostByUrlAndLanguage(String url, String language) {
		return this.postLanguageRepository.findByUrlAndLanguage(url, language);
	}

	@Override
	public PostLanguage findNextPost(Post post, String language) {
		return this.postLanguageRepository.findNextPost(post.getPostDate(), language);
	}

	@Override
	public PostLanguage findPreviousPost(Post post, String language) {
		return this.postLanguageRepository.findPreviousPost(post.getPostDate(), language);
	}
	
	
	
}
