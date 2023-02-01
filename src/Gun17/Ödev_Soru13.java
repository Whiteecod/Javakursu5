package Gun17;

public class Ödev_Soru13 {
    public static void main(String[] args) {
      // String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        // Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        // Eğer aitse "true" çevirin.
        // Loops (döngüler) kullanın.

        String[] dizi={"Apple","Orange","Banana","Pineapple"};

        boolean varMi=false;


        for (int i = 0; i <dizi.length ; i++) {
            if (varMi != dizi[i].contains("Apple"))
                System.out.println(varMi);


        }






    }
}
