package Gun25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        ArrayList<Ogrenci> snf=new ArrayList<>();
        Scanner scanStr=new Scanner(System.in);
        Scanner scanInt=new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.println("Öğrenci Adi ="); ogr.adi=scanStr.nextLine();
            System.out.println("Öğrenci Soyadi ="); ogr.soyadi=scanStr.nextLine();
            System.out.println("Öğrenci sinifi ="); ogr.sinifi=scanInt.nextInt();
            System.out.println("Öğrenci adresi="); ogr.adres=scanStr.nextLine();

            snf.add(ogr);

        }

        for (Ogrenci ogr:snf) {
            System.out.println("Öğrenci adi =" + ogr.adi );
            System.out.println("Öğrenci Soyadi =" + ogr.soyadi);
            System.out.println("Öğrenci sınıfı =" + ogr.sinifi);
            System.out.println("Öğrenci adresi =" + ogr.adres);

        }

    }
}
