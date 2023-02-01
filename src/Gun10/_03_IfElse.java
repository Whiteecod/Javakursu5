package Gun10;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("Sayi Giriniz=");

        int sayi=oku.nextInt();
        int kalan=sayi %2; // 0,1, veya -1



        if (kalan ==0)
            System.out.println("Çift Yaz"); // 0 durumunda yapılacaklar
        else // !=0 yani yukarı daki değilse -1 yada 1
            System.out.println("Tek yaz");




    }
}
