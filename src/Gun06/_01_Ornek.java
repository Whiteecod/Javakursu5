package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        Scanner okuInt= new Scanner(System.in);

        System.out.print("Cadde=");
        String cadde=oku.next();

        System.out.print("Sokak=");
        String Sokak=oku.next();

        System.out.print("Ülke");
        String ülke=oku.next();


        System.out.print("postakodu=");
        int postaKodu=oku.nextInt();

        System.out.println("postaKodu = " + postaKodu);
        System.out.println("ülke = " + ülke);
        System.out.println("Sokak = " + Sokak);
        System.out.println("cadde = " + cadde);


    }
}
