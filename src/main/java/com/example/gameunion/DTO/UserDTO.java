package com.example.gameunion.DTO;

import com.example.gameunion.Entity.Kullanıcı;

public class UserDTO {
    private int kullanıcıID;
    private String username;
    private String eposta;
    private String password;
    private String favoriOyunlar;
    private String arkadaşlar;
    private String takipçiler;
    private String takipEdilenler;
    private String gönderiler;
    private String katıldığıTurnuvalar;

    public UserDTO(int kullanıcıID, String kullanıcıAdı, String eposta, String password, String favoriOyunlar, String arkadaşlar, String takipçiler) {
    }


    public static UserDTO fromEntity(Kullanıcı kullanici) {
        return new UserDTO(
                kullanici.getKullanıcıID(),
                kullanici.getKullanıcıAdı(),
                kullanici.getEposta(),
                kullanici.getPassword(),
                kullanici.getFavoriOyunlar(),
                kullanici.getArkadaşlar(),
                kullanici.getTakipçiler()


        );
    }
}
