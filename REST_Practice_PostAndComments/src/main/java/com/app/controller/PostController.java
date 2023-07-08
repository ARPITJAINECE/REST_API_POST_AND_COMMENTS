package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.entities.Post;
import com.app.service.PostService;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
//dependency is : postservice
	@Autowired
	private PostService postService;

	@GetMapping
	public List<Post> fetchListOfPosts() {
		System.out.println("in the controller class's method fetchListOfPosts : " + getClass());
		return postService.getAllListOfPosts();
	}

	@PostMapping
	public Post postNewPost(@RequestBody Post post) {
		System.out.println("in the controller class's method postNewPost : " + getClass());
		return postService.addNewPost(post);
	}

	@DeleteMapping("/{post_id}")
	public ApiResponse deletePostById(@PathVariable Long post_id) {
		System.out.println("in the controller class's method deletePostById : " + getClass());
		return new ApiResponse(postService.deletePost(post_id));
	}

	@GetMapping("/{post_id}")
	public Post getAPost(@PathVariable Long post_id) {
		System.out.println("in the controller class's method postNewPost : " + getClass());
		return postService.getParticularPost(post_id);
	}

	@PutMapping
	public Post updatingThePost(@RequestBody Post post_id) {
		System.out.println("in the controller class's method updatingThePost : " + getClass());
		return postService.updatePostDetails(post_id);
	}
}
