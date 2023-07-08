package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Post;
import com.app.exception.ResourceNotFoundException;
import com.app.repositories.PostRepository;

@Service
@Transactional
public class PostServiceImpl implements PostService {
// dependency : post repository
	@Autowired
	private PostRepository postRepo;

	@Override
	public List<Post> getAllListOfPosts() {
		System.out.println(" in the method of the getAllListOfPosts: " + getClass());
		return postRepo.findAll();
	}

	@Override
	public Post addNewPost(Post post) {
		System.out.println(" in the method of the addNewPost: " + getClass());
		return postRepo.save(post);
	}

	@Override
	public String deletePost(Long post_id) {
		System.out.println(" in the method of the deletePost: " + getClass());
		if (postRepo.existsById(post_id)) {
			postRepo.deleteById(post_id);
		}
		return "post is deleted with the post_id: " + post_id;
	}

	@Override
	public Post getParticularPost(Long post_id) {
		System.out.println(" in the method of the getParticularPost: " + getClass());
		return postRepo.findById(post_id)
				.orElseThrow(() -> new ResourceNotFoundException(post_id + " : does not exists"));
	}

	@Override
	public Post updatePostDetails(Post post) {
		System.out.println(" in the method of the getParticularPost: " + getClass());
		return postRepo.save(post);
	}

}
