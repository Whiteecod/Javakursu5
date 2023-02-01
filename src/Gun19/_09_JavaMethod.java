package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // TODO - Bizim 3 tane saatimiz vardır.
        // bir tanesi tam doğru çalışıyor
        // bir tanesi her saatte 20 dk geri kalıyor
        // bir tanesi her saate 15 dk ileri gidiyor
        // bu 3 saat saat 16 da çalışmaya başlıyor.
        // SORU İSE -- Bu Saatler kaç saat ve dakika sonra tekrar aynı saati gösterirler

        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner scan = new Scanner(System.in);

        int[] dizi = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Sayi Giriniz=");
            dizi[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(dizi));

        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamYaz(dizi);
        int toplam=0;

    }

    public static void enKucukYaz(int[] sayilar) {
        Arrays.sort(sayilar);
        System.out.println("En küçük = " + sayilar[0]);

    }

    public static void enBuyukYaz(int[] sayilar) {
        Arrays.sort(sayilar);
        System.out.println("En büyük = " + sayilar[sayilar.length-1]);
    }

    public static void ortalamYaz(int[] sayilar) {
        int toplam=0;
        for (int i = 0; i <sayilar.length ; i++) {
            toplam=toplam+sayilar[i];

        }
        System.out.println("Dizinin ortalaması =" + (toplam / sayilar.length));
    }

}