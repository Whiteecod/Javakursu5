package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.println("Cümle Giriniz=");
        String cumle = oku.nextLine();

        // 01234
        // bugun -> son harfin oda numarası uzunluğun nesi ? 1 eksiği

        int uzunluk=cumle.length();
        char sonHarf=cumle.charAt(uzunluk-1);

        System.out.println("son Harf = " + sonHarf);


        // 2. Yöntem
        System.out.println("son Harf="+cumle.charAt(cumle.length()-1));




    }
}
