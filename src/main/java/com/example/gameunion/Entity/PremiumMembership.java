package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity
public class PremiumMembership
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uyelikId;
    private int kullanıcı;
    private String baslanicTarihi;
    private String bitisTarihi;
    private float fiyat;
    @OneToOne
    private Kullanıcı kullanici;

    public PremiumMembership(){}

    public PremiumMembership(int uyelikId, int kullanıcı, String baslanicTarihi, String bitisTarihi, float fiyat) {
        this.uyelikId = uyelikId;
        this.kullanıcı = kullanıcı;
        this.baslanicTarihi = baslanicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.fiyat = fiyat;
    }

    public int getUyelikId() {
        return uyelikId;
    }

    public void setUyelikId(int uyelikId) {
        this.uyelikId = uyelikId;
    }

    public int getKullanıcı() {
        return kullanıcı;
    }

    public void setKullanıcı(int kullanıcı) {
        this.kullanıcı = kullanıcı;
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

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }
}
