package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Girilen bir adı ekrana yazdırınız.

        Scanner okuyucu=new Scanner(System.in);

        System.out.print("Adınızı giriniz=");
        String ad= okuyucu.next(); // next() bir kelime okur

        System.out.println("ad = " + ad);

        /*
         okuyucu.next(); -> dediğimiz de bir kelime okur
         okuyucu.nextLine(); -> satırın tümünü okur cümle okurken bu gerekiyor

         okuyucu.nextInt(); -> int değerinde sayı okumak için
         okuyucu.nextShort(); -> short değerinde sayı okumak için
         okuyucu.nextLong(); -> long değerinde sayı okumak için
         okuyucu.nextByte(); -> byte değerinde sayı okumak için

         okuyucu.nextFloat(); float değer
         okuyucu.nextDouble(); double değer okuyor
         okuyucu.nextBoolean(); -> ture veya false girişi için

         */
    }
}
