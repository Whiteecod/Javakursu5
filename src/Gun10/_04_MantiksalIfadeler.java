package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal ifadeler
        // && ve işaretimiz. (Shift-6)
        // || veya işaretimiz (Altgr)

        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi Giriniz=");

        int sayi=oku.nextInt();

        if (sayi%2==1&&sayi >0)
            System.out.println("Ekrana uygun sayi girildi");
        else
            System.out.println("Uygun sayi girilmedi");




    }
}
