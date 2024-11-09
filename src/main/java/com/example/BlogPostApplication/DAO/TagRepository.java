package com.example.BlogPostApplication.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BlogPostApplication.Entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

}
