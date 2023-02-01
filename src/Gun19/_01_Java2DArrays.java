package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int[][] tablo= {
                {3, 4, 55},
                {234, 22, 33}

        }; // 2 SATIR 3 SUTUN

        System.out.println("satir uzunlugu ="+tablo.length);
        System.out.println("0. Satırın uzunlugu="+ tablo[0].length);
        System.out.println("1. Satırın uzunlugu="+ tablo[1].length);



        for (int i = 0; i < tablo.length; i++) { // satır uzunluğu lazım

            for (int j = 0; j < tablo[i].length; j++) { // sutun uzunluğu lazım
                System.out.print(tablo[i][j]+"\t");

            }
            System.out.println();

        }
    }
}
