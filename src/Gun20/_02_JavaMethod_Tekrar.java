package Gun20;

import java.util.Scanner;

public class _02_JavaMethod_Tekrar {
    public static void main(String[] args) {
        // Kullanıcıdan gireceği 2 sayıdan büyük olanını bulma işlemini
        // bir mettodda yaptıktan sonra main de yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi Giriniz=");
        int sayi1=scan.nextInt();

        System.out.println("Sayi Giriniz=");
        int sayi2=scan.nextInt();

        buyukSayi(sayi1,sayi2);

        int end=buyukSayi(sayi1,sayi2);

        System.out.println("end = " + end);



    }

    public static int buyukSayi(int sayi1, int sayi2) {
        if (sayi1>sayi2)
            return sayi1;
        else
            return sayi2;

    }

}
