package Arrays_Odev;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_ArrayList_Soru2 {
    public static void main(String[] args) {
//
//        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//        Store all the elements in one arraylist and print the arraylist
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//                **Örnek:**
//```
//**Girdi:**
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//**Çıktı:** [1,2,3,4,5,6,7,8,9]

        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> arrlist=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arrlist.add(arr[i][j]);

            }


        }
        System.out.println("arrlist = " + arrlist);





    }
}
