package SETS_Odev;

import java.util.HashSet;
import java.util.Iterator;

public class _Soru1_ {
    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();
        hs.add(4);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(7);

        totalCount(hs);




    }
    public static void totalCount (HashSet<Integer> hs){
        System.out.println("hs.size() = " + hs.size());


        for (int eleman:hs ) {
            System.out.println("eleman = " + eleman);
        }

            
        }

}
