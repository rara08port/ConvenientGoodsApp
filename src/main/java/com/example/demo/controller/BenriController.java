package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Post;

import com.example.demo.form.LoginForm;
import com.example.demo.service.PostService;


@Controller
@RequestMapping("/benri")
public class BenriController {
	
	private final PostService postService;

    public BenriController(PostService postService) {
        this.postService = postService;
    }
	
	/**
     * ログイン画面を表示
     * @param model
     * @return resources/templates下のHTMLファイル名
     */
    @GetMapping
    public String benri(Model model) {
    	
        model.addAttribute("title", "便利");
        
        List<Post> postList = postService.findAll();
        
        model.addAttribute("postList", postList);
       
        return "benri/postlist";
    }
    
    @GetMapping("category/{category}")
	public String showPostByCategory(@PathVariable("category") int category, 
			 Model model) {
		
    	List<Post> postList = postService.findByCategory(category);
    	model.addAttribute("postList",postList);
	
    	return "benri/postlist";
	}

}
