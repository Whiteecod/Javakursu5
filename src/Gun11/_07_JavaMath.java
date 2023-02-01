package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını
        //  bulunuz

        Scanner oku=new Scanner(System.in);

        System.out.println("Sayi Giriniz=");
        int a= oku.nextInt();

        System.out.println("Sayi Giriniz=");
        int b =oku.nextInt();

        System.out.println("Sayi Giriniz=");
        int c =oku.nextInt();

        // 1. YÖNTEM
        int enb=Math.max(a,b);
        enb=Math.max(enb,c);
        System.out.println("enb =" + enb);

        // 2. YÖNTEM
        int enb2=Math.max(a,Math.max(b,c) );
        System.out.println("enb2 = " + enb2);

    }
}
