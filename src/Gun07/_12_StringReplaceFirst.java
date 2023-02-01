package Gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        // relaceFirst : bir string için de ki karakter(leri) verilenle değiştirir sadece ilkini

        String text="Merhaba Dünya";

        System.out.println("text = " + text);
        System.out.println("text.replaceFirst(a,e) = " + text.replaceFirst("a","e"));
        System.out.println("text.replaceFirst(ba,de) = " + text.replaceFirst("ba","de"));
        System.out.println("text.replaceFirst(Dünya,Java) = " + text.replaceFirst("Dünya","Java"));
        System.out.println("text.replaceFirst(a,'') = " + text.replaceFirst("a",""));
    }
}
