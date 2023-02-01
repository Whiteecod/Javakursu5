package Gun20;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class _03_JavaMethod_Tekrar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi Giriniz=");
        int sayi=scan.nextInt();

        int carpim=faktoriyel(sayi);

        if (carpim %2 == 0)
            System.out.println("Çift yaz");
        else
            System.out.println("Tek Yaz");
    }

    public static int faktoriyel(int sayi) {
        int carpim = 1;
        for (int i = 1; i <=sayi; i++) {
            carpim = carpim * i;
        }
        return carpim;
    }
}
