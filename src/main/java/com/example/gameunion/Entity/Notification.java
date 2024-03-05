package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity
public class Notification
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bildirimId;
    private String tarihSaat;
    private int alıcıId;
    private String durumu;

    @ManyToOne
    @JoinColumn(name = "kullanici_id")
    private Kullanıcı kullanici;

    public Notification(){}

    public Notification(int bildirimId, String tarihSaat, int alıcıId, String durumu) {
        this.bildirimId = bildirimId;
        this.tarihSaat = tarihSaat;
        this.alıcıId = alıcıId;
        this.durumu = durumu;
    }

    public int getBildirimId() {
        return bildirimId;
    }

    public void setBildirimId(int bildirimId) {
        this.bildirimId = bildirimId;
    }

    public String getTarihSaat() {
        return tarihSaat;
    }

    public void setTarihSaat(String tarihSaat) {
        this.tarihSaat = tarihSaat;
    }

    public int getAlıcıId() {
        return alıcıId;
    }

    public void setAlıcıId(int alıcıId) {
        this.alıcıId = alıcıId;
    }

    public String getDurumu() {
        return durumu;
    }

    public void setDurumu(String durumu) {
        this.durumu = durumu;
    }
}
