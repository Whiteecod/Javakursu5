package While_DoWhile_for_break_continue;

import java.util.Arrays;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int[] dizi=new int[10];


        for (int i = 0; i <dizi.length ; i++) {
            dizi[i]=(int)(Math.random()*11);

        }

        System.out.println(Arrays.toString(dizi));
        System.out.print("Sayi Giriniz=");
        int sayi=scan.nextInt();

        for (int i = 0; i <dizi.length ; i++) {
          if (dizi[i] == sayi)
              System.out.println(i+ ".İndexde");
        }


    }
}
