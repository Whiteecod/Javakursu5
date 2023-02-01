package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        
        // equals : 2 Stringin birbirine eşit olup olmadığını kontrol eder
        // sonuç ise booleandır
        
        String s1="Merhaba";
        String s2="MERHABA";
        
        boolean esitMi=s1.equals(s2); // s1 eşit mi s2 ye Merhaba - MERHABA

        System.out.println("esitMi = " + esitMi); // Merhaba MERHABA

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // Merhaba MERHABA

        System.out.println("s1.equals(Merhaba) = " + s1.equals("Merhaba"));
        // bu şekilde farklı şekillerde yapılabilinir.
        // en son işlem de parantez için de kine eşit mi şeklinde yazdırılıyor
        // yani yeni bir kelime vererek buna eşit mi s1.equals("Merhaba") olan

    }
}
