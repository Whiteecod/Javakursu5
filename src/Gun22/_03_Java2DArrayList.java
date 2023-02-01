package Gun22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizikNotlari = new ArrayList<>();
        ArrayList<Integer> kimyaNotlari = new ArrayList<>();

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
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizikNotlari);
        notlarListesi.add(kimyaNotlari);

        // Soru 1:
        // Notları ekrana ders adlarını bir
        // ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizi");
        dersler.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) { // her bir derslerin tüm notları

            System.out.print(dersler.get(i) + " : ");

            for (int j = 0; j < notlarListesi.get(i).size(); j++) { // tek tek notlar
                System.out.print(notlarListesi.get(i).get(j) + "\t");

            }
            System.out.println();

        }
        // Soru 2:
        // Kullanıcıdan istediği bir dersin nosunu alarak
        // ( 0- Mat, 1- Fiz, 2 - Kim )
        // sadece istediği derse ait notları bir metodda yazdırınız

        System.out.println("******************************");

        Scanner scan=new Scanner(System.in);
        System.out.print("Seçiminiz ( (0-Mat, 1-Fiz, 2-Kim )");
        int dersNo=scan.nextInt();

        dersNotlariniYazdir(notlarListesi,dersNo);
        dersOrtVeGecenMikBul(notlarListesi,dersNo);


        // Yukarı da verilen derse ait not ortalamasını ve geçen sayısını bir
        // metodda yazdırınız
    }
     public static void dersNotlariniYazdir
             (ArrayList< ArrayList <Integer> >notlarListesi, int dersNo) {
         for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
             System.out.print(notlarListesi.get(dersNo).get(i) + "\t");

         }

}

    public static void dersOrtVeGecenMikBul(ArrayList< ArrayList<Integer> > notlarListesi, int dersNo){

        int toplam=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam+=notlarListesi.get(dersNo).get(i);
        }

        int ort= toplam/notlarListesi.get(dersNo).size();

        int gecenMik=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if (notlarListesi.get(dersNo).get(i)>= ort)
                gecenMik++;
        }

        System.out.println("ort = " + ort);
        System.out.println("gecenMik = " + gecenMik);
    }


     }

