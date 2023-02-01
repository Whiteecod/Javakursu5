package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryMultipleCatch {
    public static void main(String[] args) {

        try {

            Scanner scan = new Scanner(System.in);

            System.out.print("Sayi1=");
            int sayi1 = scan.nextInt();

            System.out.print("Sayi2=");
            int sayi2 = scan.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bölüm =" + bolum);

//            String kelime="";   // genel hataya düşmesi için yapıldı
//            kelime.charAt(3);

        } catch (InputMismatchException ex) // belirli bir hata
        {
            System.out.println("Lütfen sayi giriniz");
        }
        catch (ArithmeticException ex) // belirli bir hata
        {
            System.out.println("Sıfıra bölme hatası");
        }
        catch (Exception ex) // yukarıdakilerin dışında hatalar için
        {
            System.out.println("Hata oluştu " + ex.getMessage());
        }
        System.out.println("Program bitti");
    }
}
