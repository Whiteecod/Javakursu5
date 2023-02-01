package Gun06;

import java.util.Scanner;

public class _01_OrnekHocanınyaptığı {
    public static void main(String[] args) {

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        System.out.print("Cadde=");
        String cadde=okuStr.nextLine();

        System.out.print("Sokak=");
        String sokak=okuStr.nextLine();

        System.out.print("Posta Kodu=");
        int postaKodu=okuInt.nextInt();

        System.out.print("Ülke=");
        String ulke=okuStr.nextLine();

        System.out.println("Adres="+cadde+" "+sokak+" "+postaKodu+" "+ulke);


    }
}
