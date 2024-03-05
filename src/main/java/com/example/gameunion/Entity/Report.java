package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity
public class Report
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int raporId;
    private String ıcerik;
    private int raporlayanId;
    private String raporlananIcerik;
    private  String tarihSaat;
    private String durumu;

    @ManyToOne
    @JoinColumn(name = "kullanici_id")
    private Kullanıcı kullanici;

    public Report(){}
    public Report(int raporId, String ıcerik, int raporlayanId, String raporlananIcerik, String tarihSaat, String durumu) {
        this.raporId = raporId;
        this.ıcerik = ıcerik;
        this.raporlayanId = raporlayanId;
        this.raporlananIcerik = raporlananIcerik;
        this.tarihSaat = tarihSaat;
        this.durumu = durumu;
    }

    public int getRaporId() {
        return raporId;
    }

    public void setRaporId(int raporId) {
        this.raporId = raporId;
    }

    public String getIcerik() {
        return ıcerik;
    }

    public void setIcerik(String ıcerik) {
        this.ıcerik = ıcerik;
    }

    public int getRaporlayanId() {
        return raporlayanId;
    }

    public void setRaporlayanId(int raporlayanId) {
        this.raporlayanId = raporlayanId;
    }

    public String getRaporlananIcerik() {
        return raporlananIcerik;
    }

    public void setRaporlananIcerik(String raporlananIcerik) {
        this.raporlananIcerik = raporlananIcerik;
    }

    public String getTarihSaat() {
        return tarihSaat;
    }

    public void setTarihSaat(String tarihSaat) {
        this.tarihSaat = tarihSaat;
    }

    public String getDurumu() {
        return durumu;
    }

    public void setDurumu(String durumu) {
        this.durumu = durumu;
    }
}
