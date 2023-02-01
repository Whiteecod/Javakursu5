package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar" + sayilar);

        // Sıralı işlem
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Tersine çevirme
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Max ve min eleman bulma
        System.out.println("Max() =" + Collections.max(sayilar));
        System.out.println("Max() =" + Collections.min(sayilar));

        // bütün elemanları set etme
        Collections.fill(sayilar,0);
        System.out.println("sayilar = " + sayilar);

        // replace
        Collections.replaceAll(sayilar,0,5);
        System.out.println("sayilar = " + sayilar);

        // tanımlarken değer atama
        int [] dizi={2,3,4,5,6};
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3,4,5,6));
        ArrayList<String> listeStr=new ArrayList<>(Arrays.asList("Ahmet","Mehmet","Büşra","Roman"));

        ArrayList<Integer> liste2= new ArrayList<>();
        Collections.addAll(liste2, 2,3,4,5,67);
        System.out.println(liste2);

        // diziyi direk Arraylist e nasıl atarım.
        Integer[] dizi2={2,3,4,5,6};
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("list3 = " + list3);

    }
}
