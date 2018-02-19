package com.afuentes.services;

import java.util.List;
import com.afuentes.models.Post;
import com.afuentes.models.PostLanguage;

public interface IPostService {

	public Post getPostById(Long idPost);
	
	public List <Post> getAllPostByLanguageOrderByDate();
	
	public PostLanguage getPostByUrlAndLanguage(String url, String language);
	
	public PostLanguage findNextPost(Post post, String language);
	
	public PostLanguage findPreviousPost(Post post, String language);
	
}
