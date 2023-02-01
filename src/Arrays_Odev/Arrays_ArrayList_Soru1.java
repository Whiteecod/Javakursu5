package Arrays_Odev;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_ArrayList_Soru1 {
    public static void main(String[] args) {
//        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
//        Bütün 2'leri 6'yla değiştirin.
//        Array'i yazdırınız.

        int[][] dizi={
                {2,3,2},
                {4,1,5},
                {7,2,5}
        };

        for (int i = 0; i <dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                if (dizi[i][j] == 2)
                    dizi[i][j] = 6;
                }

            }
        System.out.println("Arrays.deepToString(dizi) = " + Arrays.deepToString(dizi));

        }
        
        
}
