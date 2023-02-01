package Gun30._02_FinalVariables.Ornek2;

import java.util.Scanner;

public class Soru {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {

        int gun = 0;
        int saat = 0;
        int dakika = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Gün=");
        gun = scan.nextInt();
        System.out.println("Saat=");
        saat = scan.nextInt();
        System.out.println("Dakika=");
        dakika = scan.nextInt();

        int toplamSaniye =
                gun
                        * Sabitler.birGundekiSaatSayisi
                        * Sabitler.birSaatdekiDakSayisi
                        * Sabitler.birDakikadakiSanSayisi
                        +
                        saat
                                * Sabitler.birSaatdekiDakSayisi
                                * Sabitler.birDakikadakiSanSayisi
                        +
                        dakika
                                * Sabitler.birDakikadakiSanSayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);

        //2. YÖNTEM

        System.out.println("ToplamSaniye=" + Sabitler.hesapla(gun,saat,dakika));


    }
}
