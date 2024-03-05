package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity
public class Friendship
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int arkadaşlıkId;
    private int kullanıcı1;
    private int kullanıcı2;
    private String arkadaşlıkDurumu;
    @ManyToOne
    @JoinColumn(name = "kullanici_id")
    private Kullanıcı kullanici;
    public Friendship()
    {

    }

    public Friendship(int arkadaşlıkId, int kullanıcı1, int kullanıcı2, String arkadaşlıkDurumu) {
        this.arkadaşlıkId = arkadaşlıkId;
        this.kullanıcı1 = kullanıcı1;
        this.kullanıcı2 = kullanıcı2;
        this.arkadaşlıkDurumu = arkadaşlıkDurumu;
    }

    public Friendship(int kullanıcıID, String kullanıcıAdı, String eposta, String password, String favoriOyunlar, String arkadaşlar, String takipçiler, String takipEdilenler, String gönderiler, String katıldığıTurnuvalar) {
    }

    public int getArkadaşlıkId() {
        return arkadaşlıkId;
    }

    public void setArkadaşlıkId(int arkadaşlıkId) {
        this.arkadaşlıkId = arkadaşlıkId;
    }

    public int getKullanıcı1() {
        return kullanıcı1;
    }

    public void setKullanıcı1(int kullanıcı1) {
        this.kullanıcı1 = kullanıcı1;
    }

    public int getKullanıcı2() {
        return kullanıcı2;
    }

    public void setKullanıcı2(int kullanıcı2) {
        this.kullanıcı2 = kullanıcı2;
    }

    public String getArkadaşlıkDurumu() {
        return arkadaşlıkDurumu;
    }

    public void setArkadaşlıkDurumu(String arkadaşlıkDurumu) {
        this.arkadaşlıkDurumu = arkadaşlıkDurumu;
    }
}

