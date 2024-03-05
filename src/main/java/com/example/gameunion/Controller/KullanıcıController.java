package com.example.gameunion.Controller;

import com.example.gameunion.Entity.Kullanıcı;
import com.example.gameunion.Servis.IKullanıcıServis;
import com.example.gameunion.Servis.KullanıcıServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Kullanıcı")
public class KullanıcıController {

    private final KullanıcıServis kullanıcıServis;

    public KullanıcıController(KullanıcıServis kullanıcıServis) {//injection
        this.kullanıcıServis = kullanıcıServis;
    }//facede pattern kullanıldı.kullanıcı işlemlerinin hepsi alt sınıflardan import edililerek tek sınıfta toplandı.
    @PostMapping("/kullaniciKaydet")
    public Kullanıcı createKullanici(@RequestBody Kullanıcı kullanici)
    {
       return kullanıcıServis.createKullanici(kullanici);

    }
    @GetMapping("/Tüm_Kullaniciler")
    public List<Kullanıcı>getAllKullanici()
    {
        return kullanıcıServis.getAllKullanici();
    }

    @GetMapping("/username")
    public ResponseEntity<Kullanıcı> findUser(@PathVariable String username)
    {
        Kullanıcı kullanici=kullanıcıServis.findUser(username);
        return  ResponseEntity.ok(kullanici);
    }
    @PutMapping
    public Kullanıcı updatedUser(@RequestBody  Kullanıcı kullanici)
    {
        Kullanıcı updatedUser=kullanıcıServis.updatedUser(kullanici);
        return ResponseEntity.ok(updatedUser).getBody();
    }
    @DeleteMapping("/username")
    public ResponseEntity<Void> deleteUser(@PathVariable String username)
    {
        kullanıcıServis.deleteUser(username);
        return ResponseEntity.noContent().build();
    }

}
