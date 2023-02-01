package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi Giriniz=");
        int sayi1 = scan.nextInt();

        System.out.println("Sayi Giriniz=");
        int sayi2 = scan.nextInt();

        enbSayi(sayi1, sayi2);

        int anb=enbSayi(sayi1, sayi2);
        System.out.println("anb = " + anb);

    }


    public static int enbSayi(int s1, int s2) {
//         1. Yöntem ---------------------------------
//         int donecek;
//         if (s1>s2)
//             donecek = s1;
//         else
//             donecek =s2;
//         return donecek;

         // 2. Yöntem --------------------------------
//        return s1 > s2 ? s1 : s2;

        // 3. Yöntem ---------------------------------
        if (s1 > s2)
            return s1;
        else
            return s2;

    }

}
