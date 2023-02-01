package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {
        // ilekl tip
        int sayi = 5;
        sayiArtir(sayi);
        System.out.println("sayi = " + sayi); // 5 yazacak.

        // referans tip de ne oluyor bakalım
        int[] dizi = {1, 2, 3};
        diziSifirla(dizi);
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi)); // 0,0,0 yazacak

        // Nesne tipler
        String Kelime = "İsmet";
        kelimeSifirla(Kelime);
        System.out.println("Kelime = " + Kelime);

        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.


    }

    public static void sayiArtir(int sayi) { // sayının nesi gelir bura 5 mi gelir sayi mi gelir
        sayi++; // 6                         // rakam gelir buraya ilkkel değelerin değeri gelir


    }

    public static void diziSifirla(int[] dizi) { // dizinin kendimi gelecek değerleri mi gelecek
        dizi[0] = 0;
        dizi[1] = 0;
        dizi[2] = 0;   // referans tiplerin kendisi gelir

    }

    public static void kelimeSifirla(String kelime) { // Referans gibi tanıtır ama ilkel gibi davranır
        kelime = "";                                    // dolayısıyla değeri gelir
    }
}
