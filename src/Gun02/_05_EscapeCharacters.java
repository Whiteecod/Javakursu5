package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters - ne demek ?
        // \n -> yeni satır açıyor. Alt satıra geçiyor. Bu Escape character
        // \t -> görünce sanki tab tuşuna basılmış gibi boşluk veriyor
        // \b -> Back-Space - bir karakter geri siler.
        // \" -> " tırnak yazmak için kullanıyor.
        // \\ -> \ yazılacak ekrana
        // \r -> satırın başına geri dön

        System.out.println("Merhaba\rDünya"); // Merhabadünya yazar
        System.out.println("Merhaba\nDünya"); // Merhaba yazar alt satıra geçer dünya yazar
        // print veya println : \ slaç ı görünce bu ekrana yazılacak karakter değil,
        // ayrı bir iş yapamam isteniyor. Devam eden n karakterini görünce
        // ayrı işin alt satıra geçmek olduğunu anlıyor.
        System.out.println("Merhaba\tDünya"); // Merhaba  Dünya
        System.out.println("Merhaba\bDünya"); // MerhabDünya
        System.out.println("Merhaba\"Dünya"); // Merhaba"Dünya
        System.out.println("Merhaba\\Dünya"); // Merhaba\Dünya
        System.out.println("Merhaba\rDünya"); // Dünya

    }
}
