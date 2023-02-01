package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // Baklava dilimimiz -> aslında if demektir yani eğer böyleyse
        // Girilen bir sayı 10 dan büyük ise ekrana 10dan büyük yazdırınız
        // Algoritmada
        // 1- Başla
        // 2- sayi oku    sayi=oku.nextInt()
        // 3- sayi >10 ise "10 Dan büyük" yaz -> if (Sayi>10).sout...
        // 4- dur

        Scanner sc=new Scanner(System.in);

        System.out.print("Sayi Giriniz=");
        int sayi = sc.nextInt();

        if (sayi > 10)
        { // if şartı sağlandığında yapılacakların parantezi
            System.out.println("10 dan büyük");
            System.out.println("");
        }



    }
}
