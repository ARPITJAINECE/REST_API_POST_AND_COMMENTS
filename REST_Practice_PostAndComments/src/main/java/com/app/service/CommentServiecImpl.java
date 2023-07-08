package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Comment;
import com.app.exception.ResourceNotFoundException;
import com.app.repositories.CommentRepository;

@Service
@Transactional
public class CommentServiecImpl implements CommentService {
	// dependecy: comment repository
	@Autowired
	private CommentRepository commentRepo;

	@Override
	public List<Comment> getListOfAllComments() {
		System.out.println("in the method of the service layer's getListOfAllComments : " + getClass());
		return commentRepo.findAll();
	}

	@Override
	public Comment addNewComments(Comment comm) {
		System.out.println("in the method of the service layer's addNewComments : " + getClass());
		return commentRepo.save(comm);
	}

	@Override
	public String deleteComment(Long comment_id) {
		System.out.println("in the method of the service layer's deleteComment : " + getClass());
		if (commentRepo.existsById(comment_id)) {
			commentRepo.deleteById(comment_id);
		}
		return "comment is deleted with its comentd_is : " + comment_id;
	}

	@Override
	public Comment getParticularComment(Long comment_id) {
		System.out.println("in the method of the service layer's getParticularComment : " + getClass());
		return commentRepo.findById(comment_id)
				.orElseThrow(() -> new ResourceNotFoundException(comment_id + " : does not exists"));
	}

	@Override
	public Comment updateCommentDetails(Comment comment) {
		System.out.println("in the method of the service layer's updateCommentDetails : " + getClass());
		return commentRepo.save(comment);
	}

}
