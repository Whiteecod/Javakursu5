package Gun44;

public class Soru_09 {
    public static void main(String[] args) {
        int[] intArr={8,16,32,64,128};

        // a out of bounds hatası : runtime error
//        for (int i : intArr ) // i = 8,16,32,64,128
//            System.out.println(intArr[i] + " ");

        // b şıkkı doğru.
        for (int i : intArr)
            System.out.println(i + " ");

        // c sıkkı compile error
//        for (int i = 0 : intArr) {
//            System.out.println(intArr[i] + " ");
//            i++;
//        }

        // d sıkkı indexleri yazdırır yine yanlış
        for (int i = 0; i< intArr.length; i++)
            System.out.println(i + " ");

        // e sıkkı doğru
        for (int i = 0; i <intArr.length ; i++) {
            System.out.println(intArr[i] + " ");
        }


    }
}
