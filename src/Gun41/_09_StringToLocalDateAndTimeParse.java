package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // kullanıcıdan alınan ve string durumunda time veya tarih bilgisinin
        // time veya tarih bilgisine çevirilmesi.

        long startTime=System.currentTimeMillis(); // kodun performansı

        Scanner scan=new Scanner(System.in);
        System.out.print("Tarih Giriniz (25 01 2023)=");
        String strTarih=scan.nextLine();

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih= LocalDate.parse(strTarih,f);

        System.out.println("tarih = " + tarih.format(f));


        long finisTime=System.currentTimeMillis();
        System.out.println("(finisTime-startTime) + \"sn\" = " + (finisTime-startTime) + "mn");

    }
}
