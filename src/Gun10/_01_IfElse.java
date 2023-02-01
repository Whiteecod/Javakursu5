package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Notu Giriniz=");

        int ogrNot=oku.nextInt();


        // 1. Yöntem ( ÖNCEKİ YÖNTEM )
        if (ogrNot >=50)
            System.out.println("Getiniz.");

        if (ogrNot <50)
            System.out.println("Kaldınız.");

        // 2. yöntem olması gereken
        if (ogrNot>=50) { // her zaman tek bir kontrol yapar : baklava dilimi
            System.out.println("Geçtiniz");
            System.out.println("Tebrikler");
        }
        else {
            System.out.println("Kaldınız");
        }

        }


    }

