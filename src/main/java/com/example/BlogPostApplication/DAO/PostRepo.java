package com.example.BlogPostApplication.DAO;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.BlogPostApplication.Entity.Post;

public interface PostRepo extends JpaRepository<Post,Integer> {

}
