package Abstract_Odev._02_Soru;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);

        System.out.println("Sayi Giriniz=");
        int sayi1=scan.nextInt();

        System.out.println("Sayi Giriniz=");
        int sayi2=scan.nextInt();

        Sum s=new Sum();
        System.out.println("Sum" + s.calculating(sayi1,sayi2));

        Multiply m=new Multiply();
        System.out.println("Multiply" + m.calculating(sayi1,sayi2));






    }
}
