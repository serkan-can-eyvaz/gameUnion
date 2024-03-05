package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity
public class Oyun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oyunId;
    private String oyunAdı;
    private String kategori;
    private String turnuvalar;
    private boolean turnuvaModu;  // Eklendi turnuvaModu

    @ManyToOne
    @JoinColumn(name = "kullanici_id")
    private Kullanıcı kullanici;


    private Oyun(Builder builder) {
        this.oyunId = builder.oyunId;
        this.oyunAdı = builder.oyunAdı;
        this.kategori = builder.kategori;
        this.turnuvalar = builder.turnuvalar;
        this.kullanici = builder.kullanici;
        this.turnuvaModu = builder.turnuvaModu;  // Kullanıldı turnuvaModu
    }

    public Oyun() {
    }

    public int getOyunId() {
        return oyunId;
    }

    public void setOyunId(int oyunId) {
        this.oyunId = oyunId;
    }

    public String getOyunAdı() {
        return oyunAdı;
    }

    public void setOyunAdı(String oyunAdı) {
        this.oyunAdı = oyunAdı;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getTurnuvalar() {
        return turnuvalar;
    }

    public void setTurnuvalar(String turnuvalar) {
        this.turnuvalar = turnuvalar;
    }

    public boolean isTurnuvaModu() {
        return turnuvaModu;
    }

    public void setTurnuvaModu(boolean turnuvaModu) {
        this.turnuvaModu = turnuvaModu;
    }

    public Kullanıcı getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanıcı kullanici) {
        this.kullanici = kullanici;
    }

    public static class Builder {
        private int oyunId;
        private String oyunAdı;
        private String kategori;
        private String turnuvalar;
        private Kullanıcı kullanici;
        private boolean turnuvaModu;  // Eklendi turnuvaModu

        public Builder() {
        }

        public void setOyunId(int oyunId) {
            this.oyunId = oyunId;
        }

        public void setOyunAdı(String oyunAdı) {
            this.oyunAdı = oyunAdı;
        }

        public void setKategori(String kategori) {
            this.kategori = kategori;
        }

        public void setTurnuvalar(String turnuvalar) {
            this.turnuvalar = turnuvalar;
        }

        public void setKullanici(Kullanıcı kullanici) {
            this.kullanici = kullanici;
        }

        public void setTurnuvaModu(boolean turnuvaModu) {
            this.turnuvaModu = turnuvaModu;
        }

        public Oyun build() {
            return new Oyun(this);
        }
    }

    // özel configurations göre düzenlenmiş static builder
    public static Builder buildOyunWithTurnuvaModu(int id, String oyunAdı) {
        Builder builder = new Builder();
        builder.oyunId = id;
        builder.oyunAdı = oyunAdı;
        return builder;
    }
    public static Builder buildOyunWithTurnuvaModu(int id, String oyunAdı, String kategori) {
        Builder builder = new Builder();
        builder.oyunId = id;
        builder.oyunAdı = oyunAdı;
        builder.kategori = kategori;
        return builder;
    }
    public static Builder buildOyunWithTurnuvaModu(int id, String oyunAdı, String kategori, boolean turnuvaModu) {
        Builder builder = new Builder();
        builder.oyunId = id;
        builder.oyunAdı = oyunAdı;
        builder.kategori = kategori;
        builder.turnuvaModu = turnuvaModu;
        return builder;
    }


    // ihtiyaca göre başka builder methotlar eklenebilir
}