package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity

public class Begeni
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int begeniId;
    private String tarihsaat;
    private String begenen;

    @OneToOne
    private Kullanıcı kullanıcı;

    @ManyToOne
    @JoinColumn(name = "begeniSayisi")
    private Post post;


    public Begeni(){}

    public Begeni(int begeniId, String tarihsaat, String begenen) {
        this.begeniId = begeniId;
        this.tarihsaat = tarihsaat;
        this.begenen = begenen;

    }

    public int getBegeniId() {
        return begeniId;
    }

    public void setBegeniId(int begeniId) {
        this.begeniId = begeniId;
    }

    public String getTarihsaat() {
        return tarihsaat;
    }

    public void setTarihsaat(String tarihsaat) {
        this.tarihsaat = tarihsaat;
    }

    public String getBegenen() {
        return begenen;
    }

    public void setBegenen(String begenen) {
        this.begenen = begenen;
    }
}
