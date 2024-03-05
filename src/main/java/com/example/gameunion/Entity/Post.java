package com.example.gameunion.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Post
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gonderiId;
    private  String tarihSaat;
    private String yazar;
    private String oyun;
    private String yorumlar;
    private String begenenler;

    @ManyToOne
    @JoinColumn(name = "kullanici_id")
    private Kullanıcı kullanıcı;

    @OneToMany(mappedBy = "post")
    private List<Begeni> begeni;

    @OneToMany(mappedBy = "post")
    private List<Comment>comment;


    public Post(){}
    public Post(int gonderiId, String tarihSaat, String yazar, String oyun, String yorumlar, String begenenler) {
        this.gonderiId = gonderiId;
        this.tarihSaat = tarihSaat;
        this.yazar = yazar;
        this.oyun = oyun;
        this.yorumlar = yorumlar;
        this.begenenler = begenenler;
    }

    public int getGonderiId() {
        return gonderiId;
    }

    public void setGonderiId(int gonderiId) {
        this.gonderiId = gonderiId;
    }

    public String getTarihSaat() {
        return tarihSaat;
    }

    public void setTarihSaat(String tarihSaat) {
        this.tarihSaat = tarihSaat;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getOyun() {
        return oyun;
    }

    public void setOyun(String oyun) {
        this.oyun = oyun;
    }

    public String getYorumlar() {
        return yorumlar;
    }

    public void setYorumlar(String yorumlar) {
        this.yorumlar = yorumlar;
    }

    public String getBegenenler() {
        return begenenler;
    }

    public void setBegenenler(String begenenler) {
        this.begenenler = begenenler;
    }

}
