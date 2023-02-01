package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.print("kare nin 1 kenar uzunluğu=");

        int kenar=oku.nextInt();

        int cevre=kenar+kenar+kenar+kenar;
        int alan=kenar*kenar;




        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);







    }
}
