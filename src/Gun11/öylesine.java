package Gun11;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class öylesine {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Bir Cümle Giriniz=");
        String cumle=sc.nextLine();

        Pattern pattern= Pattern.compile("a");
        Matcher matcher= pattern.matcher(cumle);

        int sayac =0;

        while (matcher.find(sayac));
           sayac++;

        System.out.println(sayac);


    }
}
