package Gun13;

import java.util.Scanner;

public class denemeler2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int tutulanSayi=(int)(Math.random()*(20-10)+10);
        int sayac=1;

        while (sayac<3) {
            System.out.println(tutulanSayi+"Tahmininiz");
            int tahmin = oku.nextInt();

            if (tahmin == tutulanSayi)
                System.out.println("Tebrikler");
            else
                System.out.println("Bilemediniz" + tutulanSayi);
            sayac++;

        }


    }
}
