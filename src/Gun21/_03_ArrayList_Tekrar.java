package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList_Tekrar {
    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<>();
        String devaMMi;

        int toplam = 0;
        do {
            System.out.println("Not Giriniz=");
            int not = scanInt.nextInt();
            notlar.add(not);
            toplam = toplam + not;
            System.out.println("Devam etmek istiyor musunuz ? (E/H)");
            devaMMi = scanStr.next();

        } while (devaMMi.equalsIgnoreCase("E"));
        int ort = toplam / notlar.size();
        int gecensayisi = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ort)
                gecensayisi++;


        }


    }
}
