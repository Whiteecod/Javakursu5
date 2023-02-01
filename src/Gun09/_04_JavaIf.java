package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız
        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi Giriniz=");
        int sayi = oku.nextInt();


        if (sayi % 2 != 0)
            System.out.println("Tek");

        if (sayi % 2 == 0)
            System.out.println("Çift");

        // Modül işareti % kalanı verir.




    }
}
