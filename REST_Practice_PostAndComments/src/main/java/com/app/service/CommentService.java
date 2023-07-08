package com.app.service;

import java.util.List;

import com.app.entities.Comment;

public interface CommentService {
// add a method to get a list of all the comments
	List<Comment> getListOfAllComments();

	// add a method to add new Comments
	Comment addNewComments(Comment comm);

	// add a method to delete a particular comment by its comment_id;
	String deleteComment(Long comment_id);

	// method to update the comments
	// step: 1: get that particular comment which is to be updated
	Comment getParticularComment(Long comment_id);

	// step: 2: now updating the above get comment
	Comment updateCommentDetails(Comment comment);
}
