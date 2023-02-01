package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi; // hafızada int kadar yer ayırıyor, sadece tam sayı atılabiliniyor
        // tam sayılarda defoult INT
        // tam sayılar

        byte byteDeger = 7; // -128    127
        short shorDeger = 1645; // -32000 ile .. 32000
        int intDeger = 250000;
        long longDeger = 23232323232323L;

        // ondalıklı sayılar
        // ondalıklı sayılarda default double dır.
        double doubleDeger = 3.14423234; // noktadan sonra 16 hane duyarlıdır.
        float floatDeger = 3.144443f; // noktadan sonra 7 tane duyarlıdır

        // Karakter veya Karakterler de bu şekilde
        char basHarf='A'; // bir tane karakter saklayabilir
        String isim="İsmet"; // Kelime veya cümle saklayabilir

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shorDeger = " + shorDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);

    }
}
