package com.app.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name = "posts")
@JsonIgnoreType
public class Post extends BaseEntity {
	@Column(name = "title", length = 25)
	private String titile;
	@Column(name = "description", length = 50)
	private String desciption;

	/*
	 * // one to many relation between the post and the comments
	 * 
	 * @OneToMany(orphanremoval )
	 * 
	 * @JoinColumn(name = "comment_id") List<Comment> comments = new
	 * ArrayList<Comment>();
	 * 
	 * public List<Comment> getComments() { return comments; }
	 * 
	 * public void setComments(List<Comment> comments) { this.comments = comments; }
	 */
	public Post(String titile, String desciption, List<Comment> comments) {
		super();
		this.titile = titile;
		this.desciption = desciption;
		// this.comments = comments;
	}

	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(String titile, String desciption) {
		super();
		this.titile = titile;
		this.desciption = desciption;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	@Override
	public String toString() {
		return "Post [titile=" + titile + ", desciption=" + desciption + "]";
	}

}
