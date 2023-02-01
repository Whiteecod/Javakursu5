package Odev_Metodlar;

public class Method_Soru1 {
    public static void main(String[] args) {
//        1-Ismi **randomNum** olan bir method oluşturun.
//        Parametre olarak **int max** almalı.
//        Bu method, 0 ile max arasında random bir değer döndürmelidir.
//        Random numarayı döndürünüz.


    int maxSayi=Integer.MAX_VALUE;
    int minSayi=0;

        randomNum(maxSayi,minSayi);


        System.out.println("randomNum(maxSayi,minSayi) = " + randomNum(maxSayi,minSayi));






    }
    public static int randomNum (int max, int min) {
          int rasgeleSayi=(int)(Math.random()*(max-min)+1) + min;
        
        return rasgeleSayi;
    }
    

}
