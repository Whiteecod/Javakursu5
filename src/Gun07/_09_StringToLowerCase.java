package Gun07;

import javax.lang.model.SourceVersion;

public class _09_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase: Stringi küçük harfe çevirir.

        String text="Hello World";

        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // merhaba dünya küçük yazar

        System.out.println("he ile veya HE ile başlıyor mu ="
                +text.toLowerCase().startsWith("he"));




    }
}
