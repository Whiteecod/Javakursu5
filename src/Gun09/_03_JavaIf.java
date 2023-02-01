package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi Giriniz=");
        int sayi= oku.nextInt();
        System.out.print("Sayi2 Giriniz=");
        int sayi2=oku.nextInt();


        if (sayi>sayi2) {
            System.out.println("Büyük Yaz1");
        }
        if (sayi2>sayi)
            System.out.println("Büyük yaz2");

        if (sayi==sayi2)
            System.out.println("Eşit yaz");

    }
}
