package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll: replace gibi çalışır. Farkı kriter(Regex) verebiliyor.
        // regex: regular expression / düzenli ifadeler.
        // TODO ( Yapılacak ) : ödev : regex olarak neler yazılabiliniyor
        // googledan araştırılacak.

        String text="Merhaba Dünya123";

        System.out.println("text = " + text);
        System.out.println("text.replaceAll([abn],_) = " + text.replaceAll("[abn]","_"));
        // a veya b veya n leri _ yap -> Merh___Dü_y_123

        System.out.println("text.replaceAll([A-Z],_) = " + text.replaceAll("[A-Z]","_"));
        // A dan Z ye kadar büyük harfleri _ yap -> _erhaba _ünya123
        System.out.println("text.replaceAll([0-9],_) = " + text.replaceAll("[0-9]","_"));
            // rakamları sil Merhaba Dünya
        System.out.println("text.replaceAll([0-9],_) = " + text.replaceAll("[^0-9]","_"));
        // eğer bu ^ işareti parantez içine koyar isek rakam dışındakileri sil demek oluyor
        // yani dışındakiler anlamına geliyor


    }
}
