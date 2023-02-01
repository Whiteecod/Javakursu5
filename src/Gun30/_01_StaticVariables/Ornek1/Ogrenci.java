package Gun30._01_StaticVariables.Ornek1;

 class Ogrenci {
    String ad;
    String soyad;

    static String okulAd="Yıldırım Ilkokulu";
    // sen bir tanesin.
     //hepsi için geçerli tek bir tane eleman
     //Tekrarlayan ve tum nesneler için kullanılacak
     //değişkenler için STATIC kullanıyoruz.
     //static=sen bir tanesin
     //static varsa hafızadan tasarruf sağlar. hepsine atanır,
     //tek olarak hafızada bulunur
     //tipin, sınıfın, classın değişkeni oldu


    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

    }

     @Override
     public String toString() {
         return "Ogrenci{" +
                 "ad='" + ad + '\'' +
                 ", soyad='" + soyad + '\'' +
                 ", okulAd='" + okulAd + '\'' +
                 '}';
     }
 }
