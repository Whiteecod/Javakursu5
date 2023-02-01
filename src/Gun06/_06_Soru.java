package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("İsim soy isim giriniz=");
        String adsoyad=oku.nextLine();

        char ilkHarf=adsoyad.charAt(0);
        int boslukIndex=adsoyad.indexOf(" ");
        char soyadIlkharf= adsoyad.charAt(boslukIndex+1);

        //int olmadan char soyadIlkharf= adsoyad.charAt(adsoyad.indexOf(" ")+1); Bu şekilde de yapılaabilinir

        System.out.println(ilkHarf+"."+soyadIlkharf+".");


    }
}
