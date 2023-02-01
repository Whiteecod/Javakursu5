package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayi isteyiniz
        // bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın

        Scanner sc = new Scanner(System.in);


        int t = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Sayi Giriniz=");
            int s = sc.nextInt();


            if (s > 6 && s < 10)
                continue; // çalıştığı anda kendinden sonra gelen
            // komutları pas geçirir

            t += s;
            System.out.println("toplam=" + t);
        }
        /*BREAK ve CONTINUE
          Döngüleri etkiler
        if şartı ile çalışır
        Break döngüyü kırar.
                Continue ise sadece o adımı
        pass geçirir.döngü devam eder

         */


    }
}
