package com.example.gameunion.DAO;

import com.example.gameunion.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao extends JpaRepository<Post,Integer> {
}
