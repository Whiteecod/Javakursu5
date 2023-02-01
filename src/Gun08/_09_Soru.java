package Gun08;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Bir Cümle Giriniz=");
        String cumle=sc.nextLine();

        int boslukIndex=cumle.indexOf(" ");
        String ilkKelime=cumle.substring(0, boslukIndex);

        System.out.println("ilkKelime = " + ilkKelime);
    }
}
