package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.println("Yeni şifreniz");
        String newPassword=scan.nextLine();

        if (newPassword.length() < 8 )
        {
            System.out.println("Lütfen dikkat !");
            System.out.println("Şifre en az 8 karakterden oluşmalıdır");
            // log tutma : 8 karakterden az denem yaptı
        }

        if (newPassword.length() > 15)
        {
            System.out.println("Lütfen dikkat !");
            System.out.println("Şifre en fazla 15 karakterden oluşmalıdır");
            // log tutma
        }
    }
}