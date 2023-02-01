package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS
        // HashSet: hızlı, bunun için kendine göre algoritmik sırada tutar
        // LinkedHashSet : EKLEME SIRASINA GÖRE, sıralı tutar.
        // TreeSet : Sen ne eklersen ekle her zaman içinde SIRALI şekilde tutar, kendinden sortlu

        // hızlı, bunun için kendine göre algoritmik sırada tutar
        HashSet<String> hs=new HashSet<>();
        hs.add("Bir");
        hs.add("İki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);

        // LinkedHashSet : EKLEME SIRASINA GÖRE, sıralı tutar.
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Bir");
        lhs.add("İki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);

        // TreeSet : Sen ne eklersen ekle her zaman içinde SIRALI şekilde tutar, kendinden sortlu
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);

        TreeSet<Integer> tsint=new TreeSet<>();
        tsint.add(5);
        tsint.add(6);
        tsint.add(10);
        tsint.add(50);
        tsint.add(33);
        System.out.println("tsint = " + tsint);
    }
}
