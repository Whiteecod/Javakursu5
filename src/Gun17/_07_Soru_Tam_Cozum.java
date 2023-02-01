package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru_Tam_Cozum {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10) olarak doldurduktan sonra
        // kullanıcının gireceği bir rakamı arattırınız
        // bu rakam var ise indexini yazdırınız

        int[] dizi = new int[10];
        int sayi=0;

        for (int i = 0; i <dizi.length ; i++) {
            dizi[i]= (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(dizi));

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz =");
        sayi=scan.nextInt();

        boolean bulundu=false;
        for (int i = 0; i <dizi.length ; i++) {

            if (dizi[i] == sayi) {
                bulundu=true;
                System.out.println("var oda numarası=" + i + ".indexde");
                 }

             }

        if (!bulundu)
        {
            System.out.println("Bulunamadı");
        }
        }
}
