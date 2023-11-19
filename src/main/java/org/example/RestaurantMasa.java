package org.example;

    public class RestaurantMasa extends Masa {
        public RestaurantMasa(int masaNo) {
            super(masaNo);
        }

        @Override
        public void rezervasyonYap(String rezervasyonAdi) {
            if (getDurum() == MasaDurumu.BOS) {
                setDurum(MasaDurumu.REZERVE);
                System.out.println("Masa " + getMasaNo() + " için rezervasyon yapıldı: " + rezervasyonAdi);
            } else {
                System.out.println("Masa " + getMasaNo() + " şu an dolu veya rezerve edilmiş.");
            }
        }


    }
