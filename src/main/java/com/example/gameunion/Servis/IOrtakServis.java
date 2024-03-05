package com.example.gameunion.Servis;

import com.example.gameunion.Entity.Oyun;

import java.util.List;

public interface IOrtakServis
{
    Oyun createGame(Oyun oyun);//strategy

    Oyun getGame(Integer gameId);

    Oyun updateGame(Oyun oyun);

    void deleteGame(Integer oyunAdı);

    List<Oyun> getAllGames();
}
