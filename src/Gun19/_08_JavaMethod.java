package Gun19;

import java.util.Arrays;

public class _08_JavaMethod {
    public static void main(String[] args) {
        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
        // yazdırınız.

        int[] dizi=new int[20];

        dizidoldurYazdir(dizi);

    }

    public static void dizidoldurYazdir(int[] dizi){
        for (int i = 0; i <dizi.length ; i++) {
            dizi[i]=(int)(Math.random()*100);

        }


        System.out.println("Sayılar"+ Arrays.toString(dizi));








    }
}
