package Gun14;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kulacının gireceği bir rakama kadar olan sayıları
        // toplamını bulunuz

        Scanner sc=new Scanner(System.in);


        System.out.println("Bir Sayi Giriniz=");
        int s=sc.nextInt();
        int toplam=0;
        for (int i=1; i<=s;i++) {
            toplam=toplam+i; // toplam+=i; kısa hali
        }

        System.out.println("toplam = " + toplam);



    }
}
