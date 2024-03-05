package com.example.gameunion.DAO;

import com.example.gameunion.Entity.Oyun;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OyunDao extends JpaRepository<Oyun,Integer> {
}
