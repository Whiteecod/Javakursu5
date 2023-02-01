package Odev_Metodlar;

public class Method_Soru5 {
    public static void main(String[] args) {
//        5-EvenOddNums isminde bir method oluşturun.
//        Bu yöntem String olan bir parametreyi kabul etsin.
//        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
//        Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
//                toplam sonucu yazdırın.
//**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
//        For example Örnek:
//        String =  "6678421312"
//        6+6-7+8+4+2-1-3-1+2
//        sonuç 16 olmalı

        String[] dizi={"1,2,3,4,5,6,8,9,2,6"};

        evenOddNums(String.valueOf(dizi));

        System.out.println("dizi = " + dizi);

    }

    public static String evenOddNums(String dizi) {
        int toplam=0;
        for (int i = 0; i <dizi.length() ; i++) {
           if (dizi.length() %2 == 0)
               toplam+=dizi.length();


        }
        return dizi;
    }
}
