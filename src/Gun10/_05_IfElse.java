package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse
        // hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Kelime giriniz=");
        String kelime=oku.nextLine();


        if (kelime.length()>10 && kelime.toLowerCase().contains("study"))
        System.out.println("Evet");
        else
            System.out.println("Hayır=");


    }
}
