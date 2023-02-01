package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi = 5; // hafızada tek bir sayi tutar
        int[] dizi = new int[5]; // hafıza da 5 sayı saklar : sabit boyutlu
        int[][] tablo = new int[3][20]; // hafıza da 60 sayi saklıyor, 3x20 şeklinde  : sabit boyutlu

        // dizi lazım, ama boyutu ekledikçe artsın sildikçe azalsın
        ArrayList<Integer> list = new ArrayList<>(); // Boyu değişken olan
        ArrayList<ArrayList<Integer>> listlerinlistesi = new ArrayList<>(); // 2 boyutlu, 2 boyutu da değişken olan

        /*******************************************************/

        // Java cım şu ana kadar verdiğim değişken tipleri için teşekkür ederim,
        // fakat bana öyle bir dizi verki, hem ArrayList gibi olsun, hemde TEKRAR değerleri
        // içine almasın, öyle bir set ver bana yani dizi tipi ver bana.
        // Java mektubumuza cevap verdi.
        // Sevgili Kubilay hiç canını sıkma, bu iş için tasarlanmış SET'ler adını verdiğimiz
        // dizilerimiz var dedi. HastSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada
        // elemanları tutar.
        // LinkedHastSet -> sen ekledikçe, ekleme sırana göre, elemanlarını saklar.
        // TreeSet -> sen ekledikçe, onları her zaman SIRALI tutar dedi.
        // bunların ortak özelliği nedir: Hiç TEKRAR değer bulundurmaz.


        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        boolean eklendiMi=hs1.add(5); // true
        boolean tekrareklendiMi=hs1.add(5); // false
        hs1.add(2);

        System.out.println("hs1 = " + hs1);
        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("tekrareklendiMi = " + tekrareklendiMi);


    }
}
