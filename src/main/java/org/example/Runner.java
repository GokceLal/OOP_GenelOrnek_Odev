package org.example;

public class Runner {
    /**
     * Bu örnekte internetten gördüğüm masa rezarvasyonunu çözücem.
     * Çıktı:
     * Masa * için rezaryasyon yapıldı: İsim
     * Cafe Mase * için rezarvasyon yapıldı: İsim
     *
     * *=sayı
     *
     */
    public static void main(String[] args) {
        RestaurantMasa restaurantMasa = new RestaurantMasa(2);
        CafeMasa cafeMasa = new CafeMasa(4);

        restaurantMasa.rezervasyonYap("Gökçe");
        cafeMasa.rezervasyonYap("Lal");
    }

    }
