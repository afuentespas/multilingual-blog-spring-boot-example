package com.afuentes.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.afuentes.models.Post;
import com.afuentes.models.PostLanguage;
import com.afuentes.services.IPostService;

@Controller
public class PostController {
	
	@Autowired
	private IPostService postService;
	
	@RequestMapping(value = "/")
	public String indexWitoutLanguage(Model model) {
		return new String("redirect:/es/");
	}
	
	@RequestMapping(value = "/{language:es|en}")
	public String index(@PathVariable(value = "language") String language, Model model) {
		List <Post> posts = this.postService.getAllPostByLanguageOrderByDate();
		model.addAttribute("posts", posts);
		return "index";
	}
	
	@RequestMapping(value = "/{language:es|en}/post/{url}")
	public String singlePost(@PathVariable(value = "language") String language, @PathVariable(value = "url") String url, Model model) {
		PostLanguage post = this.postService.getPostByUrlAndLanguage(url, language);
		model.addAttribute("post", post);
		if(post != null) {
			model.addAttribute("previousPost", this.postService.findPreviousPost(post.getPost(), language));
			model.addAttribute("previousNext", this.postService.findNextPost(post.getPost(), language));
		}
		return (post != null) ? "single-post" : "404";
	}

}
