package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {
	@Column(length = 50)
	@NotNull
	private String text;

	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(@NotNull String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Comment [text=" + text + "]";
	}

}
