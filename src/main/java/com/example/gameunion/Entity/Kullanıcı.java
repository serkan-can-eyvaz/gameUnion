package com.example.gameunion.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Kullanıcı {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kullanıcıID;
    private String username;
    private String eposta;
    private String password;
    private String favoriOyunlar;
    private String arkadaşlar;
    private String takipçiler;
    private String takipEdilenler;
    private String gönderiler;
    private String katıldığıTurnuvalar;

    @OneToMany(mappedBy = "kullanıcı")
    private List<Tournament>  tournament;

    @OneToOne
    private Post post;
    @OneToOne
    private PremiumMembership prm;

    @OneToOne
    private Begeni begeni;

    @OneToMany(mappedBy = "kullanici")
    private List<Comment> comment;

    @OneToMany(mappedBy ="kullanici" )
    private List<Report> report;

    @OneToMany(mappedBy = "kullanici")
    private List<Grup>grup;

    @OneToMany(mappedBy = "kullanici")
    private List<Payment>payment;

    @OneToMany(mappedBy = "kullanici")
    private List<İnteraction>i̇nteraction;

    @OneToMany(mappedBy = "kullanici")
    private List<Notification>notifications;

    @OneToMany(mappedBy = "kullanici")
    private List<Friendship> friendship;
    @OneToMany(mappedBy = "kullanici")
    private List<Oyun>oyun;



public Kullanıcı(){}


    public Kullanıcı(int kullanıcıID, String username, String eposta, String password, String favoriOyunlar, String arkadaşlar, String takipçiler, String takipEdilenler, String gönderiler, String katıldığıTurnuvalar) {
        this.kullanıcıID = kullanıcıID;
        this.username = username;
        this.eposta = eposta;
        this.password = password;
        this.favoriOyunlar = favoriOyunlar;
        this.arkadaşlar = arkadaşlar;
        this.takipçiler = takipçiler;
        this.takipEdilenler = takipEdilenler;
        this.gönderiler = gönderiler;
        this.katıldığıTurnuvalar = katıldığıTurnuvalar;

    }

    public int getKullanıcıID() {
        return kullanıcıID;
    }

    public void setKullanıcıID(int kullanıcıID) {
        this.kullanıcıID = kullanıcıID;
    }

    public String getKullanıcıAdı() {
        return username;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.username = kullanıcıAdı;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFavoriOyunlar() {
        return favoriOyunlar;
    }

    public void setFavoriOyunlar(String favoriOyunlar) {
        this.favoriOyunlar = favoriOyunlar;
    }

    public String getArkadaşlar() {
        return arkadaşlar;
    }

    public void setArkadaşlar(String arkadaşlar) {
        this.arkadaşlar = arkadaşlar;
    }

    public String getTakipçiler() {
        return takipçiler;
    }

    public void setTakipçiler(String takipçiler) {
        this.takipçiler = takipçiler;
    }

    public String getTakipEdilenler() {
        return takipEdilenler;
    }

    public void setTakipEdilenler(String takipEdilenler) {
        this.takipEdilenler = takipEdilenler;
    }

    public String getGönderiler() {
        return gönderiler;
    }

    public void setGönderiler(String gönderiler) {
        this.gönderiler = gönderiler;
    }

    public String getKatıldığıTurnuvalar() {
        return katıldığıTurnuvalar;
    }

    public void setKatıldığıTurnuvalar(String katıldığıTurnuvalar) {
        this.katıldığıTurnuvalar = katıldığıTurnuvalar;
    }

    public void setŞifre(String number) {
    }
}



