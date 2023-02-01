package Gun32._03_Encapsulation;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);


        Okul ok=new Okul("Kabataş Okulu", 3);

        do {
            System.out.print("Öğrenci adi:");
            String ad = scanStr.nextLine();
            System.out.print("Öğrenci soyadı:");
            String soyad = scanStr.nextLine();
            System.out.print("Öğrenci yaşi:");
            int yas = scan.nextInt();

            if (yas < 15) {
                Ogrenci ogr = new Ogrenci(ad, soyad, yas);
                ok.getOgrenciler().add(ogr);
            } else {
                System.out.println("Yaşınız uygun değil");
            }





        }while (ok.getOgrenciler().size() < ok.getKontenjan());

    }
}
