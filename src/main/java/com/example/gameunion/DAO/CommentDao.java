package com.example.gameunion.DAO;

import com.example.gameunion.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDao extends JpaRepository<Comment,Integer> {
}
