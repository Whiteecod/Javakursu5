package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan x girilene kadar ekrana "Program Çalışıyor" Yazan
        // ve x girildiğinde ise "Program Bitti" yazan programı yazınız

        Scanner oku = new Scanner(System.in);

        String okunan = "";


        do {
            System.out.print("İfade Giriniz");
            okunan = oku.next();

            System.out.print("Program Çalışıyor");


        } while (!okunan.equalsIgnoreCase("x"));


        System.out.println("Program Bitti");
    }
}
