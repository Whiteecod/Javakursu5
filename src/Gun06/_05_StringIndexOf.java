package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // 01234 : harflerin oda numaralı 0 dan başlar: Buna index deriz
        // Bugün
        //              012345678912345
        String cumle = "Merhaba Dünyalı";
        // D nin index i kaçtır
        // M nin index i kaçtır
        // 0(506)3445567 -> ( in oda numarası kaç
        // verilen karakter(ler)in in string için de ki INDEX ini verir

        System.out.println("cumle.indexOf(M)=" + cumle.indexOf("M")); // 0
        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.indexOf(ha) = " + cumle.indexOf("ha")); // 3
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" ")); // 7
        System.out.println("cumle.indexOf(a, 5) = " + cumle.indexOf("a",7));
    }
}
