package Gun13;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi1 = 10;
        int sayi2 = 20;

        int randomSayi=(int)(Math.random()*(sayi2-sayi1) + sayi1);
        System.out.print("Bir Sayi Giriniz=");
        int tahmin=scan.nextInt();

        if (randomSayi==tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("Son 2 hakkınız kaldı=");

        System.out.print("Bir Sayi Giriniz=");
        int tahmin2=scan.nextInt();

        if (randomSayi!=tahmin2)
            System.out.println("Son hakkınız kaldı");

        System.out.print("Bir Sayi Giriniz=");
        int tahmin3=scan.nextInt();

        if (tahmin3!=randomSayi)
            System.out.println("Verilen sayi="+randomSayi+" "+".Silahınla gel artık" );





    }
}
