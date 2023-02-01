package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int sayi=0; // 1 tane sayi
        int[] dizi=new int[100]; // bu 100 tane sayii oluyor

        int[] ders1Notlari=new int[50]; // 50 kişilik sınıfın 1.Dersin notları

        int[][] tumDersNotlari=new int [3][50];
        // 3 tane ders 50 tane öğrenci, 150 tane sayi
        // 3 satır 50 sütun
        // her satır 50 tane sayi 50 sütun

        ders1Notlari[0] = 80; // tek boyutlu dizinin ilk(0) elemanına 80 değeri atadım
        tumDersNotlari[0][0] = 80; // 2 boyutlu dizide 0. satırın 0. sütununa 80 değeri atadım

        System.out.println("(tumDersNotlari[0][0]) = " + (tumDersNotlari[0][0]));

        Scanner scan=new Scanner(System.in);
        tumDersNotlari[0][0]=scan.nextInt();
    }
}
