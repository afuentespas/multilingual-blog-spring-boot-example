package com.afuentes.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.afuentes.models.PostLanguage;


public interface PostLanguageRepository extends JpaRepository <PostLanguage, Long>{

	public PostLanguage findByUrlAndLanguage(String url, String language);
	
	@Query(value="SELECT pl.*FROM POSTS_LANGUAGES pl, POSTS p " + 
			"WHERE p.POST_DATE > ?1  AND language = ?2 AND p.id_post = pl.id_post " + 
			"ORDER BY p.POST_DATE ASC LIMIT 0, 1", nativeQuery = true)
	public PostLanguage findNextPost(Date date, String language);
	
	@Query(value="SELECT pl.* " + 
			"FROM POSTS_LANGUAGES pl, POSTS p " + 
			"WHERE p.POST_DATE < ?1  AND language = ?2 AND p.id_post = pl.id_post " + 
			"ORDER BY p.POST_DATE DESC LIMIT 0, 1", nativeQuery = true)
	public PostLanguage findPreviousPost(Date date, String language);

}
