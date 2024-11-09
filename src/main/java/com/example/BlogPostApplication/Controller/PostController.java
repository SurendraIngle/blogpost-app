package com.example.BlogPostApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.BlogPostApplication.DAO.PostDaoImpl;
import com.example.BlogPostApplication.Entity.Post;
import com.example.BlogPostApplication.Service.PostService;

@Controller
public class PostController {
	@Autowired
	PostService postService;
	
	@CrossOrigin
	@GetMapping("/showPost")
	
	public String showPost() {
		//Post post= new Post();  
	  // model.addAttribute("post", post); 
		System.out.println("Hello sachin");
	   return "redirect:/posts";  
	}
	@PostMapping("/post")
	public void createPost(@ModelAttribute("post") Post post) {
		postService.writePost(post);
	}

}
