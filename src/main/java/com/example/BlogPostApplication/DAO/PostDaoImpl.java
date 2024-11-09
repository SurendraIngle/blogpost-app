package com.example.BlogPostApplication.DAO;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.BlogPostApplication.Entity.Post;



public class PostDaoImpl {
//	@Autowired
//	private PostRepo postRepo;
//	
	public void writePost(Post post) {
		post.setCreated_at(null);
		post.setPublished_at(null);
		post.setIs_published(true);
//		postRepo.save(post);
		
		
	}
	public void updatePost() {
		Post post = new Post();
		post.setTitle(null);
		post.setExcerpt(null);
		post.setAuthor(null);
		post.setAuthor(null);
		post.setCreated_at(null);
		post.setPublished_at(null);
		post.setUpdated_at(null);
		post.setIs_published(true);
		
	}
	public void removePost() {
		
	}
	public void findPost() {
		
	}
	public void showAllPost() {
		
	}
	public void sortPost() {
		
	}

}
