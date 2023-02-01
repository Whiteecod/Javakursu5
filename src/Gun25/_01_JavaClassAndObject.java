package Gun25;

// tiplerin tanımlandığı yer

public class _01_JavaClassAndObject {

    // metodların yazıldığı yer
    public static void main(String[] args) { // Başla
            // Ana programın başladığı ve çalıştığı yer
        int sayi=5;

        Araba benimArabam=new Araba(); // Araba tür : tip adı, benim arabam ise nesne
        benimArabam.marka="BMW";
        benimArabam.renk="beyaz";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2000;

        System.out.println("benimArabam = " + benimArabam.yili);
        System.out.println("benimArabam = " + benimArabam.renk);
        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam = " + benimArabam.motorHacmi);

    } // dur bölümü

   //  metodların yazıldığı yer
}

// tiplerin tanımlandığı yer -- Tipler dediğimiz şey "class"

class Araba {
   String renk;
    int yili;
    String marka;
    int motorHacmi;
}
