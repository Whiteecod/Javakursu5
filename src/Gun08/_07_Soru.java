package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi Giriniz=");
        int sayi1= oku.nextInt();
        System.out.print("Sayi Giriniz=");
        int sayi2= oku.nextInt();

        System.out.println("(sayi1 == sayi2 = " + (sayi1 == sayi2));

        // 2. Yöntem
        boolean esitMi=(sayi1==sayi2);
        System.out.println("esitMi = " + esitMi);


    }
}
