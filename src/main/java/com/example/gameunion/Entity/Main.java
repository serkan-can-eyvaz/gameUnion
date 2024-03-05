package com.example.gameunion.Entity;


public class Main {

    public static void main(String[] args) {
        // Oyun nesnesi oluşturmak için builder yöntemini kullanın
        Oyun oyun = Oyun.buildOyunWithTurnuvaModu(1, "BFM2", "RTS")
                .build();


        // Oyun nesnesinin özelliklerini yazdırın
        System.out.println("Oyun ID: " + oyun.getOyunId());
        System.out.println("Oyun Adı: " + oyun.getOyunAdı());
        System.out.println("Kategori: " + oyun.getKategori());
        System.out.println("Turnuva Modu: " + oyun.isTurnuvaModu());
    }
}
