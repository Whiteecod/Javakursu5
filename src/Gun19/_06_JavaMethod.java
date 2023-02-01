package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz(); // Math.random();
        merhabaYazIsme("İsmet"); // Math.Abs(-10)

        cokMerhabayaz(5);



    }

    private static void merhabaYazIsme(String isim) {
        System.out.println(isim+"Merhaba");
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

    }

    public static void cokMerhabayaz(int miktar) {
        for (int i = 0; i < miktar; i++) {
            System.out.println("Merhaba");

        }
    }


    }


