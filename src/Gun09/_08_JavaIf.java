package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // Aynı veya değil şeklinde cevaplayınız

        Scanner oku = new Scanner(System.in);

        System.out.print("Şifrenizi giriniz=");
        String sifre = oku.nextLine();

        System.out.print("Şifrenizi tekrar giriniz=");
        String sifre2 = oku.nextLine();

        if (sifre.equals(sifre2))
            System.out.println("Aynı şifre giridiniz");

        if (!sifre.equals(sifre2))
            System.out.println("Doğru giriş yaptınız");

        // Hocanın yaptığı yol

        boolean ayniMi = sifre.equals(sifre2);

        if (ayniMi == true)
            System.out.println("AYNI");
        if (ayniMi == false)
            System.out.println("HAYIR");

    }
}
