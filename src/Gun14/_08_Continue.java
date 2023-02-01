package Gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana
        // alta alta olacak şşekilde yazdırınız, boşluklarını yazmasın.

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Kelime Girin=");
        String kelime=sc.nextLine();

        for (int i=0;i<kelime.length();i++)
        {
            if (kelime.charAt(i)==' ')
                continue;

            System.out.println(kelime.charAt(i));



        }




    }
}
