package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Vize Notunuzu Giriniz=");
        int vize = oku.nextInt();

        System.out.print("Final Notunuzu Giriniz");
        int finalNot = oku.nextInt();

        int ortalama = (finalNot + vize) / 2;

        if (ortalama >= 60) {
            System.out.println("Geçtiniz");
            System.out.println("ortalamanız ise = " + ortalama);
        }
        else
            System.out.println("Kaldınız");

        // Süslü Parantez Kuralı: sadece 1 satır(;) çalışacak ise zorunlu değildir.
        // birden fazla ise zorunlu. Her zaman koyulabilinir. hiç bir mahsuru yok



    }


}
