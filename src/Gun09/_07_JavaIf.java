package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Soru:  Girilen bir cümledeki küçük veya büyük a
        // harfinin olup olmadığı yazdırınız



        Scanner sc = new Scanner(System.in);
        System.out.println("Cümle Giriniz=");
        String cumle = sc.nextLine();

        cumle = cumle.toLowerCase(); // Bütün büyük harfler küçük oldu

        if (cumle.contains("a"))
            System.out.println("EVET");

        if (!cumle.contains("a")) /// ! değilse
            System.out.println("HAYIR");

        // 2. YOL

        if (cumle.indexOf("a") != -1)
            System.out.println("EVET");
        if (cumle.indexOf("a") == -1)
            System.out.println("HAYIR");

        // 3. Yol

        boolean varMi = cumle.contains("a");
        if (varMi == true)
            System.out.println("EVET");

        if (varMi == false)
            System.out.println("HAYIR");


    }
}
