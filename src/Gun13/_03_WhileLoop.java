package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // Girilen 20 sayının toplamının sonucu yazdırınız

        Scanner oku=new Scanner(System.in);


        int sayac=1;
        int toplam=0;
        while(sayac <=5) {
            System.out.print(sayac+"Sayi Giriniz");
            int sayi=oku.nextInt();
            toplam=toplam+sayi;
            sayac++;
        }

        System.out.println(toplam);


    }
}
