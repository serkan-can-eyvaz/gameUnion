package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity// Jpa ile sql table oluşturma
public class Comment
{
    @Id//Benzersiz id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// artan sıralı id
    private int yorumId;
    private String tarihSaat;
    private String yazar;
    private String begenenler;

    @ManyToOne()
    @JoinColumn(name = "kullanici_id")
    private Kullanıcı kullanici;

    @ManyToOne
    @JoinColumn(name = "gönderiSayisi")
    private Post post;

    public Comment(){}

    public Comment(int yorumId, String tarihSaat, String yazar, String begenenler) {
        this.yorumId = yorumId;
        this.tarihSaat = tarihSaat;
        this.yazar = yazar;
        this.begenenler = begenenler;
    }

    public int getYorumId() {
        return yorumId;
    }

    public void setYorumId(int yorumId) {
        this.yorumId = yorumId;
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

    public String getBegenenler() {
        return begenenler;
    }

    public void setBegenenler(String begenenler) {
        this.begenenler = begenenler;
    }
}


