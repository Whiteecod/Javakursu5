package Gun27._01_Ornek;

public class Utility {

    public String getString(int sayi) {
        return String.valueOf(sayi);
    }

    public static String getString2(int sayi) {
        return String.valueOf(sayi);
    }

    // STATİC olan methodlar SINIFA a yani CLASS yani TİP e ait
    // STATİC olmayanlar kime ait nesneye ait bu sebeple
    // mutlaka oluşturulmaları gerekiyor.

    // Nesneyi ilgilendiren metdoları normal yazıyoruz.
    // Nesneyi ilgilendirmeyen, Tipi ilgilendiren
    // metodları STATIC ile yazıyoruz.
}
