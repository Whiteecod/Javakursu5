package Gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının bierler basamağının değerini yazı ile yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz=");
        int sayi=oku.nextInt();

        int birlerb=sayi %10; // 10 bölümünden kalan son rakam olur yani 4

        switch (birlerb){
            case 0:
                System.out.println("Sıfır"); break;
            case 1:
                System.out.println("bir"); break;
            case 2:
                System.out.println("iki"); break;
            case 3:
                System.out.println("üç"); break;
            case 4:
                System.out.println("dört"); break;
            case 5:
                System.out.println("beş"); break;
            case 6:
                System.out.println("altı"); break;
            case 7:
                System.out.println("yedi"); break;
            case 8:
                System.out.println("sekiz"); break;
            case 9:
                System.out.println("dokuz"); break;

                // Kural: Bir sayıdan herhangi bir rakamı almak istiyorsan
            //istediğin rakam sonda kalacak şekilde böl, sonrada modül 10 al



        }









    }
}
