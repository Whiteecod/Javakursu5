package Gun23;

import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        HashSet<Integer> hs2=new HashSet<>();
        hs2.add(4);
        hs2.add(5);
        hs2.add(6);
        hs2.add(7);

        System.out.println("hs1 = " + hs1);
        System.out.println("hs2 = " + hs2);
// BİRLEŞTİRME
        HashSet<Integer> birlesikHali=new HashSet<>();
        birlesikHali.addAll(hs1);
        birlesikHali.addAll(hs2);
        System.out.println("birlesikHali = " + birlesikHali);

        HashSet<Integer> farki=new HashSet<>();
        farki.addAll(hs1);
        farki.removeAll(hs2); // hs1 dan hs2 yi çıkardı
        System.out.println("farki = " + farki);

        HashSet<Integer> ortakElemanlar=new HashSet<>();
        ortakElemanlar.addAll(hs1);
        ortakElemanlar.retainAll(hs2);
        System.out.println("ortakElemanlar = " + ortakElemanlar);

    }
}
