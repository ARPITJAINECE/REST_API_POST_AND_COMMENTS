package com.app.service;

import java.util.List;

import com.app.entities.Post;

public interface PostService {
	// add a method to get list of all the posts
	List<Post> getAllListOfPosts();

	// add a methos to add new post
	Post addNewPost(Post post);

	// add a method to delete a post by its post_id
	String deletePost(Long post_id);

	// method to update the posts
	// step: 1: get that particular post which is to be updated
	Post getParticularPost(Long post_id);

	// step: 2: now updating the above get comment
	Post updatePostDetails(Post post);
}
