package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
