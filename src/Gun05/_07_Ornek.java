package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);

        System.out.print("Dikdörtgenin Kısa Kenari=");
        int Kisakenar=oku.nextInt();

        System.out.print("Dikdörtgenin uzun kenari=");
        int Uzunkenar=oku.nextInt();

        int cevre=Kisakenar+Uzunkenar+Kisakenar+Uzunkenar;
        int alan= Kisakenar*Uzunkenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);





    }
}
