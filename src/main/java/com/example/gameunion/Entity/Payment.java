package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int odemeID;
    private boolean ucretliUyelik;
    private String tarihSaat;
    private float tutar;
    private String odemeDurumu;

    @ManyToOne
    @JoinColumn (name = "kullanici_id")
    private Kullanıcı kullanici;

    public  Payment(){}

    public Payment(int odemeID, boolean ucretliUyelik, String tarihSaat, float tutar, String odemeDurumu) {
        this.odemeID = odemeID;
        this.ucretliUyelik = ucretliUyelik;
        this.tarihSaat = tarihSaat;
        this.tutar = tutar;
        this.odemeDurumu = odemeDurumu;
    }

    public int getOdemeID() {
        return odemeID;
    }

    public void setOdemeID(int odemeID) {
        this.odemeID = odemeID;
    }

    public boolean isUcretliUyelik() {
        return ucretliUyelik;
    }

    public void setUcretliUyelik(boolean ucretliUyelik) {
        this.ucretliUyelik = ucretliUyelik;
    }

    public String getTarihSaat() {
        return tarihSaat;
    }

    public void setTarihSaat(String tarihSaat) {
        this.tarihSaat = tarihSaat;
    }

    public float getTutar() {
        return tutar;
    }

    public void setTutar(float tutar) {
        this.tutar = tutar;
    }

    public String getOdemeDurumu() {
        return odemeDurumu;
    }

    public void setOdemeDurumu(String odemeDurumu) {
        this.odemeDurumu = odemeDurumu;
    }

}
