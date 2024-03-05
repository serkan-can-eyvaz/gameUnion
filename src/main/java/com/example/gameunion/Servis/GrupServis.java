package com.example.gameunion.Servis;

import com.example.gameunion.DAO.GrupDao;
import com.example.gameunion.Entity.Grup;
import com.example.gameunion.Entity.Oyun;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GrupServis implements IGrupServis
{
    private final GrupDao grupDao;

    public GrupServis(GrupDao grupDao) {
        this.grupDao = grupDao;
    }


    public Grup createGrup(Grup grup) {
        return grupDao.save(grup);
    }

    public Grup getGrup(Integer grupId) {
        return grupDao.findById(grupId).orElse(null);
    }

    public Grup updateGrup(Grup grup) {
        return grupDao.save(grup);
    }

    public void deleteGrup(Integer grupId) {
        grupDao.deleteById(grupId);
    }

    public List<Grup> getAllGruplar() {
        return grupDao.findAll();
    }

    @Override
    public Oyun createGame(Oyun oyun) {
        return null;
    }

    @Override
    public Oyun getGame(Integer gameId) {
        return null;
    }

    @Override
    public Oyun updateGame(Oyun oyun) {
        return null;
    }

    @Override
    public void deleteGame(Integer oyunAdı) {

    }

    @Override
    public List<Oyun> getAllGames() {
        return null;
    }
}
