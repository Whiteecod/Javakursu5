package Gun44;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Soru_01 {
    public static void main(String[] args) {
        //-----------------------------------------//
        // bu şekilde de olabilir
        int array3[]=new int[2];
        //-----------------------------------------//
        // bu şekilde de olur
        int[] array2;
        array2=new int[2];
        //-----------------------------------------//
        // böyle de olabilir
        ArrayList<String> list=new ArrayList<>();
        //-----------------------------------------//
        int [] array=new int[2];
        array[0]=10;
        array[1]=20;
        System.out.println(array[0] + ":" + array[1]);
    }
}
