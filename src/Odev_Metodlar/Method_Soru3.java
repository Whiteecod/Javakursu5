package Odev_Metodlar;

public class Method_Soru3 {
    public static void main(String[] args) {
//        reverseString isminde bir method oluşturun.
//        Bu method bir String'i parametre olarak alsın.
//        Ve bu method, girilen String'i tersten yazsın.
//        Terste yazılmış halini yazdırınız.
//        Örn: String = "Java'yı Seviyorum."
//        Print: .muroyiveS ıy'avaJ

        String cumle = "Java'yı Seviyorum";

        reverseString(cumle);






    }

    public static String reverseString(String cumle) {
        for (int i = cumle.length()-1; i >=0 ; i--) {
            System.out.print(cumle.charAt(i));

        }


        return cumle;
    }
}


