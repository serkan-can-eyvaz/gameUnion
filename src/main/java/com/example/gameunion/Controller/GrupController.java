package com.example.gameunion.Controller;
import com.example.gameunion.Servis.GrupServis;
import com.example.gameunion.Entity.Grup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Grup")
public class GrupController
{
    private  final GrupServis grupServis;

    public GrupController(GrupServis grupServis) {
        this.grupServis = grupServis;
    }

    @PostMapping
    public ResponseEntity<Grup> createGrup(@RequestBody Grup grup) {
        Grup savedGrup = grupServis.createGrup(grup);
        return new ResponseEntity<>(savedGrup, HttpStatus.CREATED);
    }

    @GetMapping("/{grupId}")
    public ResponseEntity<Grup> getGrup(@PathVariable Integer grupId) {
        Grup grup = grupServis.getGrup(grupId);
        return grup != null ? ResponseEntity.ok(grup) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{grupId}")
    public ResponseEntity<Grup> updateGrup(@PathVariable Integer grupId, @RequestBody Grup grup) {
        Grup updatedGrup = grupServis.updateGrup(grup);
        return updatedGrup != null ? ResponseEntity.ok(updatedGrup) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{grupId}")
    public ResponseEntity<Void> deleteGrup(@PathVariable Integer grupId) {
        grupServis.deleteGrup(grupId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Grup>> getAllGruplar() {
        List<Grup> gruplar = grupServis.getAllGruplar();
        return ResponseEntity.ok(gruplar);
    }
}
