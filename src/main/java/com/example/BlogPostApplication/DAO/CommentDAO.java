package com.example.BlogPostApplication.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.BlogPostApplication.Entity.Comment;



public interface CommentDAO extends CrudRepository<Comment, Integer> {

}
