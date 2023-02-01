package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        int toplam = 0;
        String devamMi;
        ArrayList<Integer> notlar = new ArrayList<>();


        do {
            // Notu girecek
            System.out.print("Not giriniz =");
            int not = scanInt.nextInt();
            // Notları arraliste at
            notlar.add(not);
            toplam = toplam + not;
            // devam etmek istiyor musunuz ( E / H )

            System.out.print("Devam etmek istiyor musunuz ? (E/H)");
            devamMi = scanStr.next();

        } while (devamMi.equalsIgnoreCase("E"));
        // Ortalamayı bul
        int ort = toplam / notlar.size();
        // Geçen sayısını bul
        int gecenSayisi = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ort)
                gecenSayisi++;

        }
        System.out.println("gecenSayisi = " + gecenSayisi);
        System.out.println("ort = " + ort);


    }
}
