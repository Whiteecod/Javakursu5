package Gun08;

public class _01_JavaAritmeticOperators {
    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("Toplama İşlemi");
        System.out.println("a+b => " + (a+b)); // 14

        System.out.println("Çıkarma İşlemi");
        System.out.println("a-b => " + (a-b)); // 4

        System.out.println("Çarpma İşlemi");
        System.out.println("axb => " + (a*b));// 45

        System.out.println("Bölme İşlemi");
        System.out.println("a/b => " + (a/b));
        // normal sonuc 1.8 fakat tam sayının tam sayıya bölümünde
        // küsürat atılır. bu sebeple sonuc 1 olur. yuvarlama olmaz çünkü int/ int
        // tam sonuç istersen bir tanesini double çevirmen yeterli.

        System.out.println("(double)a/b => " + ((double)a/b));

        System.out.println("Modül işlemi");
        System.out.println("a % b =>" + (b&a)); // 9%5 => 4
        System.out.println("b % a  = " + (b % a)); // 5%9 =>5
        //  Kısa önemli Not.!
        //  Modül (%)'de
        //  sol büyük ise kalanı al
        //  sol küçükse solundakini al




    }
}
