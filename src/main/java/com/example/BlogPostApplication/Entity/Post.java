package com.example.BlogPostApplication.Entity;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="excerpt")
	private String excerpt;
	
	@Column(name="content")
	private String content;
	
	@Column(name="author")
	private String author;
	@Column(name="published_at")
	private Timestamp published_at;
	@Column(name="is_published")
	private Boolean is_published;
	@Column(name="created_at")
	private Timestamp created_at;
	@Column(name="updated_at")
	private Timestamp updated_at;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	@ManyToMany
	private List<Tag > tagList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExcerpt() {
		return excerpt;
	}
	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Boolean getIs_published() {
		return is_published;
	}
	public void setIs_published(Boolean is_published) {
		this.is_published = is_published;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//	public List<Tag> getTagList() {
//		return tagList;
//	}
//	public void setTagList(List<Tag> tagList) {
//		this.tagList = tagList;
//	}
	public Timestamp getPublished_at() {
		return published_at;
	}
	public void setPublished_at(Timestamp published_at) {
		this.published_at = published_at;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
}
