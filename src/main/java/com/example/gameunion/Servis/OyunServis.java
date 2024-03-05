package com.example.gameunion.Servis;

import com.example.gameunion.DAO.OyunDao;
import com.example.gameunion.Entity.Oyun;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OyunServis implements IOyunServis
{
    private final OyunDao oyunDao;


    public OyunServis(OyunDao oyunDao) {
        this.oyunDao = oyunDao;
    }

    public Oyun createGame(Oyun oyun) {
        return oyunDao.save(oyun);
    }

    public Oyun getGame(Integer gameId) {
        return oyunDao.findById(gameId).orElse(null);
    }

    public Oyun updateGame(Oyun oyun) {
        return oyunDao.save(oyun);
    }

    public void deleteGame(Integer oyunAdı) {
        oyunDao.deleteById(oyunAdı);
    }

   public List<Oyun> getAllGames()
   {
       return oyunDao.findAll();
   }
}
