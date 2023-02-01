package Odev_Metodlar;

import java.util.Scanner;

public class Method_Soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("Bir Cümle Giriniz =");
        String dizi=scan.nextLine();
        reverseDizi(dizi);
    }
    public static String reverseDizi (String dizi) {
        for (int i = dizi.length() -1 ; i >=0 ; i--) {
            System.out.print(dizi.charAt(i));

        }
        return dizi;
    }
}
