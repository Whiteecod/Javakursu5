package Gun21;

import java.util.ArrayList;
import java.util.Objects;

public class _01_Arraylist {
    public static void main(String[] args) {
        // Dizi Array : boyut sayısı belli,
        // sonradan değiştirilemez
        int[] dizi = new int[5]; // Array 5 elemanlı ve boyutu sonradan
        // değiştirilemiyor.

        // Boyutu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın.
        // ArrayList : Boyutunu başta vermene bile gerek yok.
        // Boyutu başlangıçta 0 ; eleman ekledikçe artar. sildikçe kısalır.

        ArrayList<Integer> IntegerList = new ArrayList<>();
        ArrayList<String> StringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet"); // uzunluk burda 1 oldu
        isimler.add("Metin"); // uzunluk 2 oldu
        isimler.add("Hacer"); // uzunluk 3 oldu
        isimler.add("Aynur"); // uzunluk 4 oldu

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1,"Muhammed"); // Verilen index e ekliyor. Yani
        // Diğerlerini 1 kaydırıyor sona doğru

        System.out.println("isimler = " + isimler);

        isimler.set(1,"Zafer"); // verilen indexdeki elemanı değiştirir
        System.out.println("isimler = " + isimler);

        boolean varMi=isimler.contains("Metin"); // var mi ?
        System.out.println("varMi = " + varMi); // true sonuç verir

        isimler.remove("Metin");// değere göre siler
        System.out.println("isimler = " + isimler);

        isimler.remove(1); // index e göre siler
        System.out.println("isimler = " + isimler);

        int indexOAynur=isimler.indexOf("Aynur");
        System.out.println("indexOAynur = " + indexOAynur);

        String ilkEleman=isimler.get(0); // verilen indexdeki değeri verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear(); // her şeyi temizliyor.
        System.out.println("isimler = " + isimler);




    }
}
