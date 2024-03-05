package com.example.gameunion.DAO;

import com.example.gameunion.Entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentDao extends JpaRepository<Tournament,Integer> {
}
