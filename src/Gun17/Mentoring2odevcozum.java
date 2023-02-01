package Gun17;

import java.util.Scanner;

public class Mentoring2odevcozum {
    public static void main(String[] args) {
    /*    // Girilen bir email in uygun formatta olup olmadigini belirten bir program yaziniz.


Girilen email icin uygunluk kosullari

1- Email ".com" ile bitmeli techno@study.com
2- Email "@" işareti bulundurmali techno@study.com
3- "@" işareti ".com" dan once olmali techno@study
4- "@" işareti öncesinde en az 1 karakter olmali techno@study.com
5- "@" ile ".com" arasinda en az 1 karakter olmali. techno@study.com
     /*****************************************************/



        Scanner scan=new Scanner(System.in);

        System.out.println("Email Adresinizi giriniz =");
        String email=scan.nextLine();

        if (email.endsWith(".com")
                   &&
                     email.contains("@")
                    &&
                      email.indexOf("@")<email.indexOf(".com")
                     &&
                       !email.substring(0,email.indexOf("@")).isEmpty()
                      &&
                        !email.substring(email.indexOf("@")+1,email.length()-4).isEmpty())
            System.out.println("Geçerli");
            else
            System.out.println("Geçersiz");
    }
}
