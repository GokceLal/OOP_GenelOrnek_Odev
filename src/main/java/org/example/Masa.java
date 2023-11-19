package org.example;


    abstract class Masa {
        private final int masaNo;
        private MasaDurumu durum;

        public Masa(int masaNo) {
            this.masaNo = masaNo;
            this.durum = MasaDurumu.BOS;
        }

        public int getMasaNo() {
            return masaNo;
        }

        public MasaDurumu getDurum() {
            return durum;
        }

        public void setDurum(MasaDurumu durum) {
            this.durum = durum;
        }

        public abstract void rezervasyonYap(String rezervasyonAdi);
    }
