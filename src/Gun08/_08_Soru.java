package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // Girilen bir sayının tek sayi olup olmadığını yazdırınız

        Scanner sc=new Scanner(System.in);

        System.out.print("Sayi giriniz=");
        int sayi1=sc.nextInt();

        // 3 5 1000009 ise 1003 ise tek dir değil mi sayının 2 ye bölümünden
        // kalan 1 ise anlarsın

        int kalan=sayi1 %2; // bu 1 e eşitse

        System.out.println("Tek mi "+(kalan==1));

    }
}
