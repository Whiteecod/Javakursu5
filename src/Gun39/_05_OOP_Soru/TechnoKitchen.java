package Gun39._05_OOP_Soru;

import Gun13._denemeler3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TechnoKitchen  {

    public static void islemYap() {
        Scanner oku = new Scanner(System.in);
        ArrayList siparisler = new ArrayList<>();
        int siparis = 0;
        int secim;
        int toplamUcret=0;
        do {

            System.out.println("----------------------");
            System.out.println("---------MENÜ---------");
            System.out.println("----------------------");
            System.out.println("1- Adana Kebap 55TL");
            System.out.println("2- lahmacun 33TL");
            System.out.println("3- Borsh 33TL");
            System.out.println("4- Palov 44TL");
            System.out.println("0- Sipariş Tamamlandı");
            System.out.print("Seçiniz = ");
            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    AdanaKebap a = new AdanaKebap();
                    siparisler.add(a);
                    siparis++;
                    
                    break;
                case 2:
                    Lahmacun l = new Lahmacun();
                    siparisler.add(l);
                    siparis++;
                    break;
                case 3:
                    Borsh b = new Borsh();
                    siparisler.add(b);
                    siparis++;
                    break;
                case 4:
                    Palov p = new Palov();
                    siparisler.add(p);
                    siparis++;
                    break;

            }
            if (secim > 4) {
                System.out.println("hatalı giriş");
            }

            System.out.println("Sipariş adeti = " + siparis);

        } while (secim != 0);


    }




}

