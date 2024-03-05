package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity
public class Tournament
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int turnuvaId;
    private String turnuvaAdi;
    private String oyun;
    private String kullanıcılar;
    private String baslanicTarihi;
    private String bitisTarihi;

    @ManyToOne
    @JoinColumn(name = "kullanici_id")
    private Kullanıcı kullanıcı;



    public Tournament(int turnuvaId, String turnuvaAdi, String oyun, String kullanıcılar, String baslanicTarihi, String bitisTarihi) {
        this.turnuvaId = turnuvaId;
        this.turnuvaAdi = turnuvaAdi;
        this.oyun = oyun;
        this.kullanıcılar = kullanıcılar;
        this.baslanicTarihi = baslanicTarihi;
        this.bitisTarihi = bitisTarihi;
    }

    public Tournament() {

    }

    public int getTurnuvaId() {
        return turnuvaId;
    }

    public void setTurnuvaId(int turnuvaId) {
        this.turnuvaId = turnuvaId;
    }

    public String getTurnuvaAdi() {
        return turnuvaAdi;
    }

    public void setTurnuvaAdi(String turnuvaAdi) {
        this.turnuvaAdi = turnuvaAdi;
    }

    public String getOyun() {
        return oyun;
    }

    public void setOyun(String oyun) {
        this.oyun = oyun;
    }

    public String getKullanıcılar() {
        return kullanıcılar;
    }

    public void setKullanıcılar(String kullanıcılar) {
        this.kullanıcılar = kullanıcılar;
    }

    public String getBaslanicTarihi() {
        return baslanicTarihi;
    }

    public void setBaslanicTarihi(String baslanicTarihi) {
        this.baslanicTarihi = baslanicTarihi;
    }

    public String getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(String bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }
}
