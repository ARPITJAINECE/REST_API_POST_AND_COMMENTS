package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.entities.Comment;
import com.app.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	// dependency : comment service
	@Autowired
	private CommentService comService;

	@GetMapping
	public List<Comment> fetchAllListOfComments() {
		System.out.println("in the controller class's method fetchAllListOfComments : " + getClass());
		return comService.getListOfAllComments();
	}

	@PostMapping
	public Comment postNewComments(@RequestBody Comment comment) {
		System.out.println("in the controller class's method postNewComments : " + getClass());
		return comService.addNewComments(comment);
	}

	@DeleteMapping("/{comment_id}")
	public ApiResponse deleteCommentById(@PathVariable Long comment_id) {
		System.out.println("in the controller class's method deleteCommentById : " + getClass());
		return new ApiResponse(comService.deleteComment(comment_id));
	}

	@GetMapping("/{comment_id}")
	public Comment getASingleComment(@PathVariable Long comment_id) {
		System.out.println("in the controller class's method deleteCommentById : " + getClass());
		return comService.getParticularComment(comment_id);
	}

	@PutMapping
	public Comment updateAComment(@RequestBody Comment comment_id) {
		System.out.println("in the controller class's method updateAComment : " + getClass());
		return comService.updateCommentDetails(comment_id);
	}

}
