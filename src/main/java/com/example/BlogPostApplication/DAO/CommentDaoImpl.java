package com.example.BlogPostApplication.DAO;



import org.springframework.beans.factory.annotation.Autowired;

import com.example.BlogPostApplication.Entity.Comment;



public class CommentDaoImpl  {
	@Autowired
	private CommentDAO commentDao;
	
	public void writeComment() {
	Comment comment= new Comment();
	comment.setName(null);
	comment.setEmail(null);
	comment.setComment(null);
	comment.setCreated_at(null);
	comment.setUpdated_at(null);
	comment.setPost_id(0);
	comment.setUser(null);
	commentDao.save(comment);
	}
	
	public void removeComment() {
		
	}
	public void readComment() {
		
	}
	public void updateComment() {
		Comment comment= new Comment();
		comment.setName(null);
		comment.setEmail(null);
		comment.setComment(null);
		comment.setCreated_at(null);
		comment.setUpdated_at(null);
		comment.setPost_id(0);
		comment.setUser(null);
		commentDao.save(null);
		
	}

	

}
