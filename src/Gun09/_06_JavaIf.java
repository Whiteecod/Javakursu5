package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise evet geçmiyor ise hayır yazdırınız

        System.out.println("Cümle Giriniz=");
        String cumle=sc.nextLine();



        if (cumle.contains("a"))
        System.out.println("EVET");

        if ( !cumle.contains("a")) /// ! değilse
            System.out.println("HAYIR");

        // 2. YOL

        if (cumle.indexOf("a")!= -1)
            System.out.println("EVET");
        if (cumle.indexOf("a") ==-1)
            System.out.println("HAYIR");

        // 3. Yol

        boolean varMi=cumle.contains("a");
        if (varMi == true)
            System.out.println("EVET");

        if (varMi == false)
            System.out.println("HAYIR");





    }
}
