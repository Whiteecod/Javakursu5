package Gun17;

import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Sayi giriniz=");
        int sayi=sc.nextInt();


        System.out.println(sayi >=0 ? (sayi%2==0 ? "Çift" : "Tek") + "Pozitif" : (sayi %2==0 ? "Çift" : "Tek")+ "Negatif");
    }
}
