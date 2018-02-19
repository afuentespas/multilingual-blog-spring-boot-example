package com.afuentes.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "posts_languages")
public class PostLanguage {
	
	@Id
	@Column(name="id_post_language")
	private Long idPostLanguage;

	@Column(name="id_post")
	private Long idPost;
	
	@Column(name="language")
	private String language;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;
	
	@Column(name="summary")
	private String summary;
	
	@Column(name="url")
	private String url;
	
	@ManyToOne
	@JoinColumn(name = "id_post", insertable = false, updatable = false)
	private Post post;

	public Long getIdPostLanguage() {
		return idPostLanguage;
	}

	public void setIdPostLanguage(Long idPostLanguage) {
		this.idPostLanguage = idPostLanguage;
	}
	
	public Long getIdPost() {
		return idPost;
	}

	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
