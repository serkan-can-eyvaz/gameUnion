package com.example.gameunion.Servis;
import com.example.gameunion.Entity.Tournament;

import java.util.List;

public interface ITournamentServis extends IOrtakServis{
//jenerik interface
        Tournament createTournamnet(Tournament tournament);

        Tournament getTournament(Integer turnuvaId);

        Tournament updateTournament(Tournament tournament);

        void deleteTournament(Integer turnuvaId);

        List<Tournament> getAllTournaments();
    }


