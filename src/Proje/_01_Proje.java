package Proje;

import Gun13._denemeler3;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class _01_Proje {
    public static void main(String[] args) {
        // Scanner class tanimlayin...
        Scanner scan = new Scanner(System.in);
        // Kullanicidan ismini girmesini isteyin ve girilen ismin ilk hafrini buyuk harfe donusturun...
        System.out.println("İsim giriniz =");
        String name = scan.next();
        name = name.substring(0, 1).toUpperCase() + name.toLowerCase().substring(1);

        // Kullanicinin girdigi ismi ekrana yazdirarak, " Ahmet hosgeldin, soyismini girer misin?" diye soralim...
        System.out.println(name + " " + "Hoş Geldiniz" + "," + " Soy isminizi girer misiniz?");
        String surname = scan.next();

        // Kullanici nin ismini ve soyismini ilk harfi buyuk digerleri kucuk olacak sekilde yazdiralim...
        surname = (surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase());

        System.out.println(name + " " + surname);

        // Ekranda gorulen isim soyisim dogru ise "Y" tusuna basarak devam edilecek sekilde dongu olusturalim...
        String tekrarDeneme;
        String harf;
        do {
            System.out.println("Ekranda görülen isminiz doğru ise \"Y\" tuşuna basarak devam edelim.");
            harf = scan.next();
            if (harf.equalsIgnoreCase("Y")) {
                System.out.println("Başarılı bir şekilde giriş yaptınız");
            }
            else {
                System.out.println("Lütfen tekrar deneyiniz");
            }

            tekrarDeneme=scan.next();

        } while (tekrarDeneme.equalsIgnoreCase("Y"));

        System.out.println("Lütfen kullanıcı adınızı belirleyiniz =");
        String kullancidiadi=scan.next();

        System.out.println("Lütfen şifrenizi belirleyiniz =");
        String sifre=scan.nextLine();
        System.out.println("Şifrenizi tekrar giriniz");
        String sifretekrar=scan.nextLine();


        do {
            if (sifre.equals(sifretekrar)) ;
            {
                System.out.println("Şifre başarılı bir şekilde oluşturulmuştur.");
            }
            String sifreTekraryaz=scan.next();
                System.out.println("Tekrar giriş yapınız");

        } while (!sifre.equals(sifretekrar));


        // Eger kullanici "Y" haricinde bir tusa basarsa "Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin..."
        // ikazi verelim
        // Kullaniciyi tekrar "Y" tusuna basana kadar donguye devam edelim...


        // Kullanici "Y" tusuna bastiginda "Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir..."
        // ikazi verelim


        // Kullanici adi belirleme adimi ile devam edelim ->" Lutfen kullanici adnizi belirleyin...:"


        // Sifre belirleme ile devam edelim...->" Lutfen sifrenizi belirleyiniz...:"


        // Sifre tekrar girilmelidir -> " Sifrenizi tekrar giriniz...:"


        // Girilen iki sifre birbiri ile ayni olmalidir... Degilse "Yanlis veya hatali bir sifre girdiniz,
        // lutfen tekrar deneyin..." ikazi verelim


        // Sifreler birbiri ile ayni ise "Tebrikler... "+ username + " kullanici adiyla sisteme kayit oldunuz..."
        // ikazi verelim...


    }
    }
