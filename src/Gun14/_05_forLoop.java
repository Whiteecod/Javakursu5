package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya ( dahil ) kadar olan
        // sayıların çarpımını bulunuz
        // 2. bölüm; carpımın değeri maksimum ü geçtiğinde işlem sonlansın.

        Scanner sc=new Scanner(System.in);
        System.out.println("Sayi Giriniz=");

        int s=sc.nextInt();

        int carpma=1;
        int i=0;


        for (i=1;i<=s;i++) {
            carpma *= i;


            if (carpma > 10000) {

                System.out.println("İşlemdurduruluyor" + carpma);
                break;
            }
        }
        System.out.println("carpma = " + carpma);
    }
}
