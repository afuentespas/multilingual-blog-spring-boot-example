package com.afuentes.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "posts_comments")
public class Comment {

	@Id
	@GeneratedValue
    @Column(name="id_comment")
	private Long idComment;
	
	@Column(name="id_post")
	private String idPost;
	
	@Column(name="name")
	private String name;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="image")
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "id_post", insertable = false, updatable = false)
	private Post post;

	public Long getIdComment() {
		return idComment;
	}

	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}

	public String getIdPost() {
		return idPost;
	}

	public void setIdPost(String idPost) {
		this.idPost = idPost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
	
}
