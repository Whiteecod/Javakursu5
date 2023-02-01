package Gun17;

public class ArraysÖdev {
    public static void main(String[] args) {
        // int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        // Array'in ortalamasını alınız.

        int[] dizi={12, 14 , 21 ,23 , 10 ,4};

        int enbuyukdeger=0;

        for (int i = 0; i <dizi.length; i++) {
            if (dizi[i] > enbuyukdeger ) {
                enbuyukdeger=dizi[i];

            }
        }
        System.out.println("enbuyukdeger = " + enbuyukdeger);




    }
}
