package Gun22;

import Arrays_Odev.Arrays_ArrayList_Soru1;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5; // tek bir rakam tutabilen bir değişken
        int[] dizi=new int[20]; // 20 adet sayi saklayabilen bir degisken
        // uzunluğu sabit olan ama
        int[][] tablo=new int[20][2]; // 20 x 2 lik kadar sayi sakalayabilen degisken
        // buda yine sabit uzunlukta
        ArrayList<Integer> liste=new ArrayList<>();
        // istenildiği kadar sayi ekelenebilen uzunluğu değişken olan
        /***************************/

        // bir sınıf bu sınıf da 20 kişi var ve bunların 3 dersi olsun.
        // Öğrencilerin bu 3 derse ait notlarını nasıl bir degiskende saklayabilirim
        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizikNotlari=new ArrayList<>();
        ArrayList<Integer> kimyaNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizikNotlari.add(30);
        fizikNotlari.add(40);

        kimyaNotlari.add(60);
        kimyaNotlari.add(70);
        kimyaNotlari.add(80);
        kimyaNotlari.add(90);

        // ArrayList in ArrayList ini nasıl yaparım
        ArrayList<ArrayList <Integer> > notlarListesi=new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizikNotlari);
        notlarListesi.add(kimyaNotlari);
        // Listlerin listesi oluyor yani
        notlarListesi.get(0); // -> mat notlarını verir
        int matBirNot=notlarListesi.get(0).get(0); // Mat notlarının ilkini verecek
        System.out.println("matBirNot = " + matBirNot);
        System.out.println("notlarListesi = " + notlarListesi);
        System.out.println("kimyaNotlari = " + kimyaNotlari);
        System.out.println("fizikNotlari = " + fizikNotlari);
        System.out.println("matNotlari = " + matNotlari);

        // yukardakinin yerine bir for döngüsü nasıl kullanırız.

        for (int i = 0; i <notlarListesi.size() ; i++) {
            System.out.println("notlarListesi.get("+i+") = "+notlarListesi.get(i));

        }

        /************** satır sütun yazdırma *****/

        for (int i = 0; i <notlarListesi.size() ; i++) {

            for (int j = 0; j <notlarListesi.get(i).size() ; j++) {
                System.out.print(notlarListesi.get(i).get(j) +"\t"); // i j

            }
            System.out.println();

        }

        }
}
