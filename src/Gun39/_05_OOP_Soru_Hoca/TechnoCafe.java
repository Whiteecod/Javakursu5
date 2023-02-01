package Gun39._05_OOP_Soru_Hoca;

import MyFunc.MyFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        List<IFood> siparisler = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int adet=0;
        int secim = 0;
        do {
            menu();
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    IFood ak = new AdanaKebap();
                    siparisler.add(ak);
                    adet++;
                    break;

                case 2:
                    IFood lh = new Lahmacun();
                    siparisler.add(lh);
                    adet++;
                    break;

                case 3:
                    IFood bh = new Borsh();
                    siparisler.add(bh);
                    adet++;
                    break;

                case 4:
                    IFood pv = new Palov();
                    siparisler.add(pv);
                    adet++;
                    break;
            }


        } while (secim < 5);
        System.out.println("Alınan Siparişler");
        for (IFood f : siparisler) {
            System.out.println(f.getClass().getSimpleName());
        }

        System.out.println("Siparişiniz hazırlanıyor");
        MyFunc.Bekle(2);
        double toplam=0;
        for ( IFood f: siparisler) {
            TechnoKitchen.hazirla(f);
            toplam+=f.ucret();
            MyFunc.Bekle(2);
        }

    }

    public static void menu() {
        System.out.print("\n****Menü****  +" +
                "\n 1- Adana Kebap ( 75 TL )" +
                "\n 2- Lahmacun ( 40 TL ) " +
                "\n 3- Borsh  ( 40 TL )" +
                "\n 4- Polav (20 TL ) " +
                "\n 5- Tamam" +
                "\n Seçiminiz =");
    }
}
