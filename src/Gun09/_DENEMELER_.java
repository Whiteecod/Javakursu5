package Gun09;

import java.util.Scanner;

public class _DENEMELER_ {
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);

        System.out.print("Bir Cümle Giriniz=");
        String cumle=oku.nextLine();

        int bonuslukIndex=cumle.indexOf(" ");
        int boslukIndex2=cumle.lastIndexOf(" ");

        String ilkkelime=cumle.substring(0,bonuslukIndex);
        String ikinciKelime= cumle.substring(bonuslukIndex+1,boslukIndex2);

        System.out.println("ilkkelime = " + ilkkelime);
        System.out.println("ikinciKelime = " + ikinciKelime);









    }
}
