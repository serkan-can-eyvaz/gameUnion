package com.example.gameunion.DAO;

import com.example.gameunion.Entity.İnteraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Interaction extends JpaRepository<İnteraction,Integer> {
}
