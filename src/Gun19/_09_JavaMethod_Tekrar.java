package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod_Tekrar {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra
        // dizinin en küçük en büyük elemanını ve
        // ortalamsını ayrı fonksiyonlarda bulup yazdırınız

        Scanner scan = new Scanner(System.in);
        int[] dizi = new int[5];


        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Sayi giriniz=");
            dizi[i] = scan.nextInt();

        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaYaz(dizi);


    }

    public static void enKucukYaz(int[] sayilar) {
        Arrays.sort(sayilar);
        System.out.println("En Küçük =" + sayilar[0]);
    }


    public static void enBuyukYaz (int[] sayilar) {

        Arrays.sort(sayilar);
        System.out.println("En Büyük = " + sayilar[sayilar.length-1]);
    }

    public static void ortalamaYaz (int[] sayilar) {
        Arrays.sort(sayilar);
        int toplam=0;
        toplam=toplam+sayilar.length;
        System.out.println("ortalama   = " + (sayilar.length));

    }

}
