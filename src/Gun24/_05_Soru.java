package Gun24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String, String> sozluk=new TreeMap<>();
        Scanner scanint = new Scanner(System.in);
        Scanner scanstr = new Scanner(System.in);
        int secim=0;

        do {

            // menü çıkacak (1-Ekleme, 2- Düzeltme, 3- Listeleme, 4-Arama)
            System.out.print("MENÜ\n1 - EKLEME\n2- Düzeltme\n3- Listeleme\n4- Arama\n5- Silme\n6- Çıkış\n Seçiminiz =");
            secim=scanint.nextInt();
            //seçim alınacak
            switch (secim)
            {
                case 1:
                    System.out.println("Kelime Giriniz=");
                    String kelime=scanstr.nextLine();
                    System.out.println("Manasını Giriniz=");
                    String manası=scanstr.nextLine();
                    sozluk.put(kelime,manası);
                    break;

                case 2: // 2 yi seçti ise düzeltme işlemini yap
                System.out.println("Düzeltme seçildi");
                break;

            }

           // seçime göre işlem yapılacak

        } while (secim != 6); // çıkış olmadığı sürece devam et

       // TODO: Geri kalan işlemler yapılacak
        // TODO: 2. Aşamada menulerde yapılacak işlemleri METHOD ile yapınız
    }
}
