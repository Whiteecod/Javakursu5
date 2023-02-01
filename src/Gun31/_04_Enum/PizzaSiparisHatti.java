package Gun31._04_Enum;

import Arrays_Odev.Arrays_ArrayList_Soru1;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    // TODO : Her pizza tipi için ücret bilgilendirmesi yapılacaktır.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();

        int secim=0;
        do {
            // menu
          menu();
          secim=scan.nextInt();
          // Scanner la secimi alalım
            // Secilen pizza Arrayliste ekleyelim
            switch (secim) {
                case 1: // Small pizza
                    Pizza sp=new Pizza(PizzaSize.Small);
                    siparisler.add(sp);
                    break;
                case 2: // medium pizza
                    Pizza mp=new Pizza(PizzaSize.Medium);
                    siparisler.add(mp);
                    break;
                case 3: // large pizza
                    Pizza lp=new Pizza(PizzaSize.Large);
                    siparisler.add(lp);
                    break;
                case 4: siparisYazdir(siparisler);
                break;
            }
            // Eğer 4 ü seçerse Arraylist i bir metoda gönder
            // arada hangi pizzadan kaç sipğariş verdiğini göster

        }while (secim <= 4);

    }

    public static void menu() {
        System.out.println("******* Pizza Menü ********");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme Al,Sipariş Göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seciminiz =");
    }

    public static void siparisYazdir(ArrayList<Pizza>siparisler) {

        int s=0, m=0, l=0;
        for (Pizza p: siparisler) {
            if (p.size == PizzaSize.Small) s++;
            else
                if (p.size == PizzaSize.Medium) m++;
                else
                    if (p.size == PizzaSize.Large) l++;


        }
        System.out.println("******* Siparişleriniz ********");
        System.out.println("Small Pizza Count ="+s);
        System.out.println("Medium Pizza Count ="+m);
        System.out.println("Large Pizza Count ="+l);

    }
}
