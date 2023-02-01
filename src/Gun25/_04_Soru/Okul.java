package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        ArrayList<Ogrenci> snf = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Ogrenci ogr = new Ogrenci();

            System.out.print("Okul No=");
            ogr.okulNo = scanInt.nextInt();
            System.out.print("Tam Adı=");
            ogr.tamAdi = scanStr.nextLine();
            System.out.print("Notu =");
            ogr.notu = scanInt.nextInt();

            snf.add(ogr);
        }
        bilgileriYazdir(snf);
        ortalamaYaz(snf);

    }

    public static void bilgileriYazdir(ArrayList<Ogrenci> snf) {
        for(Ogrenci ogr:snf ) {
            System.out.println("ogr.okulNo = " + ogr.okulNo);
            System.out.println("ogr.tamAdi = " + ogr.tamAdi);
            System.out.println("ogr.notu = " + ogr.notu);
        }
    }


    public static void ortalamaYaz(ArrayList<Ogrenci> snf) {
        int toplam=0;
        for(Ogrenci ogr:snf ) {
            toplam=toplam+ogr.notu;
        }
        System.out.println("Ortalama = " + toplam /snf.size());
    }

}
