package com.example.gameunion.Servis;

import com.example.gameunion.DAO.OyunDao;
import com.example.gameunion.Entity.Oyun;

import java.util.List;

public interface IOyunServis extends  IOrtakServis{

    Oyun createGame(Oyun oyun);

    Oyun getGame(Integer gameId);

    Oyun updateGame(Oyun oyun);

    void deleteGame(Integer oyunAdı);

    List<Oyun> getAllGames();
}
