package Gun16;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        // {"TRT"

        String[] dizi={"trt","atv","kanald","fox","Habertürk"};

        int rasgele=(int)(Math.random()*(dizi.length));

        System.out.println("Rasgele Seçilen Tv = " + dizi[rasgele]);
    }
}
