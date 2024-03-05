package com.example.gameunion.Servis;

import com.example.gameunion.Entity.Kullanıcı;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IKullanıcıServis {

    Kullanıcı createKullanici(Kullanıcı kullanıcı);

    List<Kullanıcı> getAllKullanici();

    Kullanıcı findUser(String username);

    Kullanıcı updatedUser(Kullanıcı kullanici);

    void deleteUser(String username);
}
