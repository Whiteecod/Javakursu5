package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {
        // ilkel tipler yani primitive tipler : short,byte,long,float,double,boolean
        int sayi1=5;
        int sayi2=10;

        sayi1=sayi2; // sayi1= 10 oldu -- eşitlesen de değerler atanır. kendi hücreleri
        System.out.println("sayi1 = " + sayi1);  // -- yine ayrı ayrı kalır
        sayi1=34;
        sayi2=45;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // Referans tipler: classlar, diziler, arraylar,nesneler
        int[] dizi1={1,2,3,4,5};
        int[] dizi2={5,6};

        System.out.println("Dizi1 =" + Arrays.toString(dizi1));
        System.out.println("Dizi2 =" + Arrays.toString(dizi2));
        System.out.println("***************************************");
        dizi1=dizi2;

        System.out.println("Dizi1 =" + Arrays.toString(dizi1));
        System.out.println("Dizi2 =" + Arrays.toString(dizi2));
        System.out.println("***************************************");
        dizi1[0]=67;
        System.out.println("Dizi1 =" + Arrays.toString(dizi1)); // 67,6
        System.out.println("Dizi2 =" + Arrays.toString(dizi2)); // 67,6
        System.out.println("***************************************");
        dizi1[0]=55;
        System.out.println("Dizi1 =" + Arrays.toString(dizi1)); // 55,6
        System.out.println("Dizi2 =" + Arrays.toString(dizi2)); // 55,6

        // Nesne Tipler : NULL alabilen ilkel tip
        // String, Integer, double, long
        String ad1="Mehmet";
        String ad2="İsmet";
        // referans ama davarınışı ilkel

        ad1=ad2;
        System.out.println("ad1 = " + ad1); // ismet
        System.out.println("ad2 = " + ad2); // ismet

        ad1="Ali";

        System.out.println("ad1 = " + ad1); // Ali
        System.out.println("ad2 = " + ad2); // ismet


    }
}
