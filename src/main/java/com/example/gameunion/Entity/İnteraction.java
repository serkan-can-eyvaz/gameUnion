package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity
public class İnteraction
{
    //Etkileşim temel özellikleri değişmediğinden abstract sınıftır.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int etkilesimID;
    private  String Kullanıcılar;
    private String katılımcılar;

    @ManyToOne
    @JoinColumn(name = "kullanici_id")
    private Kullanıcı kullanici;

    public İnteraction(){}

    public İnteraction(int etkilesimID, String kullanıcılar, String katılımcılar) {
        this.etkilesimID = etkilesimID;
        Kullanıcılar = kullanıcılar;
        this.katılımcılar = katılımcılar;
    }

    public int getEtkilesimID() {
        return etkilesimID;
    }

    public void setEtkilesimID(int etkilesimID) {
        this.etkilesimID = etkilesimID;
    }

    public String getKullanıcılar() {
        return Kullanıcılar;
    }

    public void setKullanıcılar(String kullanıcılar) {
        Kullanıcılar = kullanıcılar;
    }

    public String getKatılımcılar() {
        return katılımcılar;
    }

    public void setKatılımcılar(String katılımcılar) {
        this.katılımcılar = katılımcılar;
    }
}
