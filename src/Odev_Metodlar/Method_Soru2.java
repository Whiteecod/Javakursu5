package Odev_Metodlar;

import com.sun.deploy.ui.AboutDialog;

public class Method_Soru2 {
    public static void main(String[] args) {
//        2-"OrtaKelime" isminden bir method oluşturun.
//        Bu method String'i parametre olarak almalı.
//        Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
//                Ortadaki kelimeyi return yapınız.
//                Örnek: Ben Java'yı seviyorum.
//        print : Java'yı
//        Örnek2:
//        Java'yı kolayca öğreniyorum.
//        print: kolayca

        String cumle="Java'yı kolayca öğreniyorum.";
        ortaKelime(cumle);

        System.out.println("ortaKelime(cumle) = " + ortaKelime(cumle));



    }
    public static String ortaKelime (String cumle) {
        int boslukIndex=cumle.indexOf(" ");
        int boslukIndex2=cumle.lastIndexOf(" ");
        String ortakelime=cumle.substring(boslukIndex+1,boslukIndex2);

        return ortakelime;


    }


}
