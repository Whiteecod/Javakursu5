package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Üretilecek sayi sınırı =");

        int sinir=oku.nextInt();

        int tutulanSayi= (int)(Math.random()*sinir);

        System.out.print("Tahmininiz=");
        int tahmin=oku.nextInt();
        System.out.println("tutulanSayi = " + tutulanSayi);

        if (tahmin == tutulanSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedin ki bilemedin ki");


    }
}
