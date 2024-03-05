package com.example.gameunion.Controller;

import com.example.gameunion.Entity.Tournament;
import com.example.gameunion.Servis.ITournamentServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {

    @Autowired
    private ITournamentServis tournamentServis;

    @PostMapping
    public ResponseEntity<Tournament> createTournament(@RequestBody Tournament tournament) {
        Tournament createdTournament = tournamentServis.createTournamnet(tournament);
        return new ResponseEntity<>(createdTournament, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Tournament>> getTournaments() {
        List<Tournament> tournaments = tournamentServis.getAllTournaments();
        return new ResponseEntity<>(tournaments, HttpStatus.OK);
    }

    @GetMapping("/{tournamentId}")
    public ResponseEntity<Tournament> getTournament(@PathVariable Integer tournamentId) {
        Tournament tournament = tournamentServis.getTournament(tournamentId);
        return new ResponseEntity<>(tournament, HttpStatus.OK);
    }

    @PutMapping("/{tournamentId}")
    public ResponseEntity<Tournament> updateTournament(@PathVariable Integer tournamentId, @RequestBody Tournament tournament) {
        Tournament updatedTournament = tournamentServis.updateTournament(tournament);
        return new ResponseEntity<>(updatedTournament, HttpStatus.OK);
    }

    @DeleteMapping("/{tournamentId}")
    public ResponseEntity<Void> deleteTournament(@PathVariable Integer tournamentId) {
        tournamentServis.deleteTournament(tournamentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
