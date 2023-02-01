package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {

        tekMiCiftMi(55);
        tekMiCiftMi(60);

        tekMiCiftMiOku();
        // Kullanıcıdan sayı alarak onu tek mi çift mi yazdıralım

    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi %2 != 0)
            System.out.println("tek");
        else
            System.out.println("Çift");
    }

    public static void tekMiCiftMiOku() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi Giriniz=");
        int sayi=scan.nextInt();

        tekMiCiftMi(sayi);


    }

}
