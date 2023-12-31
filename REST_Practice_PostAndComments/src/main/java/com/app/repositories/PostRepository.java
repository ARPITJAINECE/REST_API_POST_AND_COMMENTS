package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
