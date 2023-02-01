package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp
        // ayrı ayrı yazdırınız. (Sadece ad ve soyad)

        Scanner oku= new Scanner(System.in);

        System.out.println("Adınız ve Soyadınız=");
        String adSoyad=oku.nextLine();

        // İsmet Temur, Ali koç
        //ad: 0, boslugun indexini kadar alır
        // soyad: bosluk+1 sonuna kadar alır

        int boslukIndex=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,boslukIndex);
        String soyad= adSoyad.substring(boslukIndex+1); // 2 indexi vermeezsem sonuna kadar alır

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        






    }
}
