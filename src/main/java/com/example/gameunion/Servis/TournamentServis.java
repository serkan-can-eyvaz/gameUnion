package com.example.gameunion.Servis;

import com.example.gameunion.DAO.TournamentDao;
import com.example.gameunion.Entity.Oyun;
import com.example.gameunion.Entity.Tournament;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentServis implements ITournamentServis {
    private final TournamentDao tournamentDao;

    public TournamentServis(TournamentDao tournamentDao) {
        this.tournamentDao = tournamentDao;
    }

    public Tournament createTournamnet(Tournament tournament) {
        return tournamentDao.save(tournament);

    }

    public Tournament getTournament(Integer turnuvaId) {
        return tournamentDao.findById(turnuvaId).orElse(null);
    }

    public Tournament updateTournament(Tournament tournament) {
        return tournamentDao.save(tournament);
    }

    public void deleteTournament(Integer turnuvaId) {
        tournamentDao.deleteById(turnuvaId);
    }

    @Override
    public List<Tournament> getAllTournaments() {
        return null;
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
