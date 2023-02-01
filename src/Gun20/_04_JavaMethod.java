package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi Giriniz=");
        int sayi1=scan.nextInt();

        System.out.println("Sayi Giriniz=");
        int sayi2=scan.nextInt();

        int toplam=toplamBul(sayi1,sayi2);

        System.out.println("toplam = " + toplam);




    }

    public static int toplamBul (int sayi1, int sayi2) {

        return (sayi1+sayi2);
    }
}
