package Gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        // Kullanıcı 0 değeri girene kadar
        // girdiği sayıların toplamını bulunuz
        Scanner oku=new Scanner(System.in);
         int sayi;
         int toplam=0;

        System.out.print("Sayi Giriniz=");
        sayi=oku.nextInt();
        toplam=toplam+sayi;

        while(sayi != 0) {
            System.out.print("Sayi Giriniz=");
            sayi=oku.nextInt();

            toplam=toplam+sayi;


        }

        System.out.println("toplam = " + toplam);
    }
}
