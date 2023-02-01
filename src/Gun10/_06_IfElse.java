package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku = new Scanner(System.in);

        System.out.print("Parolanızı giriniz=");
        String kural = oku.nextLine();

        if (kural.length() <= 12 && kural.length() >=8 && !kural.contains("pass"))
            System.out.println("Parola Başarılı Bir şekilde oluşturuldu");
        else {
            System.out.println("-Kurallar-");
        System.out.println("1) en az 8 karakter olmalı");
        System.out.println("2) içinde pass kelimesi olmamalı");
        System.out.println("3) en fazla 12 karakter olmalı.");
    }}
}
