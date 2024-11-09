package com.example.BlogPostApplication.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="post_tags")
public class Post_tags {
	@Id
	@Column(name="post_id")
	private int post_id;
	@Column(name="post_id")
	private int tag_id;
	@Column(name="post_id")
	private String created_at;
	@Column(name="post_id")
	private String updated_at;
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public int getTag_id() {
		return tag_id;
	}
	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	

}
