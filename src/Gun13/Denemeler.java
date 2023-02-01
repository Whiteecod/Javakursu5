package Gun13;

import java.util.Scanner;

public class Denemeler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int toplam = 0;
        int sayac = 1;

        System.out.print("Sayi Giriniz=");
        int sayi = scan.nextInt();

        while (sayac<sayi){


        toplam = toplam + sayac;

        sayac++;


    }


        System.out.println("toplam = " + toplam);






    }
}
