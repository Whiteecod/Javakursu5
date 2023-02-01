package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 0-5 arası gibi sayılar ürettik hep sıfırdan başladı
        // 4-9 arası nasıl üretitirirdim
        // Yöntem şu: önce aralık kadar normal üret (9-4) yani 0-5 arası
        // Üretilmiş olan sayıya min sayıyı ekle, böylece aralığa yerleşmiş ol
        // Yani üretilmiş sayı + 4 denilecek
        // (int) (Math.random()*(max-min))+min

        // girilen max ve min aralığında random sayı ürettiriniz.

        Scanner oku=new Scanner(System.in);
        System.out.println("Min=");
        int min=oku.nextInt();

        System.out.println("Max=");
        int max=oku.nextInt();

        int rndSayi= (int)(Math.random()*(max-min)) + min;
        System.out.println("rndSayi = " + rndSayi);




    }
}
