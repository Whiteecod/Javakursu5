package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Notu Giriniz=");
        int sayi= oku.nextInt();

        if (sayi>=50)
            System.out.println("Geçtiniz");

        if (sayi<50)
            System.out.println("Kaldınız");


    }
}
