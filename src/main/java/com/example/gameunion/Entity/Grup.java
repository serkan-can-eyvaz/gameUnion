package com.example.gameunion.Entity;

import jakarta.persistence.*;

@Entity
public class Grup
{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int grupId;
        private String grupAdı;
        private String uyeler;

        @ManyToOne
        @JoinColumn(name = "kullanici_id")
        private Kullanıcı kullanici;

        public Grup(){}
        public Grup(int groupId, String grupAdı, String uyeler) {
            this.grupId = groupId;
            this.grupAdı = grupAdı;
            this.uyeler = uyeler;
        }

        public int getGroupId() {
            return grupId;
        }

        public void setGroupId(int groupId) {
            this.grupId = groupId;
        }

        public String getGrupAdı() {
            return grupAdı;
        }

        public void setGrupAdı(String grupAdı) {
            this.grupAdı = grupAdı;
        }

        public String getUyeler() {
            return uyeler;
        }

        public void setUyeler(String uyeler) {
            this.uyeler = uyeler;
        }
    }


