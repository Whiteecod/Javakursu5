package Gun25._05_Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {


    // Bir bordro programı yapılmak isteniyor.
    // Her calisanin bordroNo(int), tamAdi(String) ve maasi(int) vardır.
    // Kullanıcıdan 20 calisan için bu bilgileri alınız.
    // Bir metodda bütün calisanlar yazdırınız.
    // Bir metodda maas ortalamasını yazdırınız.
    // Bir metodda en fazla ve en az maas alanların simlerini yazdırınız.

    Scanner scanInt=new Scanner(System.in);
    Scanner scanStr=new Scanner(System.in);

    ArrayList<Calisanlar> bordro=new ArrayList<>();


        for (int i = 0; i <2 ; i++) {
            Calisanlar calisan=new Calisanlar();
            System.out.print("Bordro No =");
            calisan.bordroNo=scanInt.nextInt();
            System.out.print("Tam Adınız =");
            calisan.tamAdi=scanStr.nextLine();
            System.out.print("Maasiniz =");
            calisan.maasi=scanInt.nextInt();

            bordro.add(calisan);

        }

        butunCalisanlar(bordro);
        maasOrtalamasi(bordro);
        enFazlaMaasAlan(bordro);

    }
    public static void butunCalisanlar(ArrayList<Calisanlar> bordro) {
        for (Calisanlar calisan:bordro) {
            System.out.println("calisan.tamAdi = " + calisan.tamAdi);
            System.out.println("calisan.maasi = " + calisan.maasi);
            System.out.println("calisan.bordroNo = " + calisan.bordroNo);
        }

    }
    public static void maasOrtalamasi (ArrayList<Calisanlar> bordro) {
        int toplam=0;
        for (Calisanlar calisan:bordro) {
            toplam=toplam+calisan.maasi;
            System.out.println("Ortalaması =" + toplam / bordro.size());
        }

    }
    public static void enFazlaMaasAlan ( ArrayList<Calisanlar> bodro) {
        int enbüyük=0;
        for (Calisanlar calisan:bodro) {
             if (calisan.maasi > enbüyük) {

            }
            enbüyük = calisan.maasi;
            System.out.println("enbüyük = " + enbüyük);
        }
    }
}
