package Gun30._02_FinalVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {

        Vatandas v1=new Vatandas("ismet");
        Vatandas v2=new Vatandas("Nazmiye");
        Vatandas v3=new Vatandas("Nurhayat");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.tcNo=456;
        // final değişkenlerine sadece 1 kez veri atanabilir.
        // oda ya tanmlanırken, yada constructor da

        final double pi=3.14;
        // Math.PI bunu içersinden görebiliriz pi değeri de final olarak
        // tanımlanmış java da
        // pi=5; // verilemiyor bu şekilde. illa class içinde olmasına
        // gerek yok bu şekilde main de de tanımlanabiliniyor.

        // Final: değer atandıktan sonra değiştirilmeyi engelleiyor
        // static sayac ise her yeni nesne oluşturulduğunda
        // yeni ortam değer almasını sağlıyor.
    }
}
