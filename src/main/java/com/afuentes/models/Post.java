package com.afuentes.models;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
	
	@Id
	@GeneratedValue
    @Column(name="id_post")
	private Long idPost;
	
	@Column(name="post_date")
	private Date postDate;
	
	@Column(name="post_update_date")
	private Date postUpdateDate;
	
	@Column(name="image")
	private String image;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_author")
	private Author author;
	
	@OneToMany(mappedBy = "post")
	private List <PostLanguage> postsLanguages;
	
	@OneToMany(mappedBy = "post")
	private List <Comment> comments;

	public Long getIdPost() {
		return idPost;
	}

	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public Date getPostUpdateDate() {
		return postUpdateDate;
	}

	public void setPostUpdateDate(Date postUpdateDate) {
		this.postUpdateDate = postUpdateDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<PostLanguage> getPostsLanguages() {
		return postsLanguages;
	}

	public void setPostsLanguages(List<PostLanguage> postsLanguages) {
		this.postsLanguages = postsLanguages;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
