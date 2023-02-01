package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayıyı Pozitif, negatif veya sıfır olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.println("Bir Sayi Giriniz=");
        int sayilar=oku.nextInt();

        if (sayilar >0 )
            System.out.println("Pozitif Yaz");
        else // ya sıfırdır yada negatifdir.

           if ( sayilar <0 )
               System.out.println("negatif");
           else
               System.out.println("Sıfır");


    }
}
