package Gun07;

import java.util.Scanner;

public class _14_ÖDEVLER {
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);

        System.out.print("Bir Cümle giriniz=");
        String cumle=oku.nextLine();

        int boslukIndex=cumle.indexOf(" ");
        int boslukIndex2=cumle.lastIndexOf(" ");
        String ilkKelime=cumle.substring(0,boslukIndex);

        System.out.println("ilkKelime = " + ilkKelime);

        








    }
}
