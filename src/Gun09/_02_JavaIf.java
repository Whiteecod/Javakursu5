package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi Giriniz=");
        int sayi=oku.nextInt();

        if (sayi>0) {
            System.out.println("Pozitif");
        }

        if (sayi<0)
            System.out.println("Negatif");

        if (sayi==0)
            System.out.println("Sıfır");

    }
}
