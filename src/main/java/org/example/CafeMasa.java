package org.example;

   public class CafeMasa extends Masa {
        public CafeMasa(int masaNo) {
            super(masaNo);
        }

        @Override
        public void rezervasyonYap(String rezervasyonAdi) {
            if (getDurum() == MasaDurumu.BOS) {
                setDurum(MasaDurumu.REZERVE);
                System.out.println("Cafe Masa " + getMasaNo() + " için rezervasyon yapıldı: " + rezervasyonAdi);
            } else {
                System.out.println("Cafe Masa " + getMasaNo() + " şu an dolu veya rezerve edilmiş.");
            }
        }
}
