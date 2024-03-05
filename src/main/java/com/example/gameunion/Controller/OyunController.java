package com.example.gameunion.Controller;

import com.example.gameunion.Servis.OyunServis;
import com.example.gameunion.Entity.Oyun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/oyunlar")
public class OyunController {

    private final OyunServis oyunServis;

    @Autowired
    public OyunController(OyunServis oyunServis) {
        this.oyunServis = oyunServis;
    }

    @PostMapping("/OyunKaydet")
    public ResponseEntity<Oyun> createOyun(@RequestBody Oyun oyun) {
        Oyun savedOyun = oyunServis.createGame(oyun);
        return new ResponseEntity<>(savedOyun, HttpStatus.CREATED);
    }

    @GetMapping("/{oyunId}")
    public ResponseEntity<Oyun> getOyun(@PathVariable Integer oyunId) {
        Oyun oyun = oyunServis.getGame(oyunId);
        return oyun != null ? ResponseEntity.ok(oyun) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{oyunId}")
    public ResponseEntity<Oyun> updateOyun(@PathVariable Integer oyunId, @RequestBody Oyun oyun) {
        Oyun updatedOyun = oyunServis.updateGame(oyun);
        return updatedOyun != null ? ResponseEntity.ok(updatedOyun) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{oyunId}")
    public ResponseEntity<Void> deleteOyun(@PathVariable Integer oyunId) {
        oyunServis.deleteGame(oyunId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Oyun>> getAllOyunlar() {
        List<Oyun> oyunlar = oyunServis.getAllGames();
        return ResponseEntity.ok(oyunlar);
    }
}
