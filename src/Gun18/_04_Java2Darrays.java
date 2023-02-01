package Gun18;

import java.util.Scanner;

public class _04_Java2Darrays {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int[][] tablo=new int[2][3];


         // burası okuma işlemi
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("Sayi Giriniz");
                tablo[i][j] = scan.nextInt();

            }
        }


            for (int i = 0; i < 2; i++) {

                for (int j = 0; j < 3; j++) {
                    System.out.print(tablo[i][j]+"\t");
                }

            }



         // en büyük bulma işlemi
        int enb=tablo[0][0];
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                if (tablo[i][j] > enb)
                    enb = tablo[i][j];
            }
            System.out.println("enb = " + enb);
        }
    }
}
