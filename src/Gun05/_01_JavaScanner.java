package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        // tipi   adı   ilk değeri   işlem tamam bu adamı çalıştır
        //   int    sayi = 0   gibi düşünebiliriz        ;
        Scanner okuyucu = new Scanner(System.in);
        // tipi   adı     yeni okuyucu  klavyeden yada konsol


        System.out.print("sayi giriniz=");
        int sayi= okuyucu.nextInt(); // kursor bekliyor sayi girişi için
        // rakam girilip entıra basıldığında değeri alıp sayiya atıyor

        System.out.println("sayi = " + sayi);


    }
}
