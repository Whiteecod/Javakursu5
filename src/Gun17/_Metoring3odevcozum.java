package Gun17;

import java.util.Scanner;

public class _Metoring3odevcozum {
    public static void main(String[] args) {
        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = oku.nextInt();

        int basamak ;

        int sayac = 1;

        while (sayi > 0){ // 123

            basamak = sayi % 10 ; // "%" kalan verir
            System.out.println(sayac + " ler basamağı : " + basamak ); // "/" bölümü verir
            sayi /= 10 ;
            sayac*=10;
        }
    }
}
