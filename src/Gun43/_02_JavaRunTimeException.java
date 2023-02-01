package Gun43;

import javafx.scene.chart.ScatterChart;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {

        try { // hata bölgesinin try {} ine aldık


        Scanner scan = new Scanner(System.in);

            System.out.print("Sayi1=");
            int sayi1 = scan.nextInt();

            System.out.print("Sayi2=");
            int sayi2 = scan.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bölüm =" + bolum);

        } catch (Exception e)
        {
            // hata mesajlarını hata isimli Exception cinsinden değişkene attım
            System.out.println("Hata = " + e.getMessage());
            System.out.println("Lütfen tekrar deneyiniz");
        }

    }
}
