package Gun13;

import java.util.Scanner;

public class Ödevler {
    public static void main(String[] args) {
        //*  6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //  bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın
        // Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        // bilemediniz yazıp tutulan sayıyı bildirsin.
        // Eğer bilirse tebrikler yazsın.

        Scanner oku = new Scanner(System.in);


        int sayi1 = 10;
        int sayi2 = 20;
        int sayac = 1;
        int randomSayi = (int) (Math.random() * (sayi1 - sayi2)) + sayi2;

        System.out.println("randomSayi = " + randomSayi);

        while (sayac<3) {
            System.out.print("Sayıyı Tahmin ediniz=");
            int tahmin = oku.nextInt();

            if (randomSayi == tahmin) {
                System.out.println("Tebrikler Bildiniz");
                break;
            }
                if (randomSayi != tahmin)
                    System.out.println("Tekrar deneyiniz");                                 



                sayac++;

            }
        }



}



