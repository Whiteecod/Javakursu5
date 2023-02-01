package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Boyunuz=");
        double boy= oku.nextDouble();

        System.out.print("Ağırlığınız");
        double ag= oku.nextDouble();

        double kitleindex=ag/(boy*boy);

        System.out.println("boy = " + boy);
        System.out.println("ag = " + ag);
        System.out.println("kitleindex = " + kitleindex);
    }
}
