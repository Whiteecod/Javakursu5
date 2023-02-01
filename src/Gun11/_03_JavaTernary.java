package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız
        // if else nin farklı bir şekilde kullanım hali
        // cevap string olduğu için string bir sonuc oluşturarak
        // sağ kısma if else olarak gireceğimiz sonucu
        // farklı bir yol ile bu şekilde de girilebildiğini görmekteyiz

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi=");

        int sayi=oku.nextInt();

        String sonuc= (sayi % 2 == 0 ) ? "Çift" : "Tek";

        System.out.println("sonuc = " + sonuc);
        // ? Soru işareti -> if yerine geçmektedir.
        // : -> ise else kısmıdır.

    }
}
