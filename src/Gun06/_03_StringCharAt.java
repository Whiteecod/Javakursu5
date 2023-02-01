package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {
        // istenilen noktada ki karakteri verir.
        // Karakterlerin sırası 0 dan başlar ve buna index denir.

        //            0123456 789 10 11 12 bu şekilde gidiyor 0 dan başlayarak
        String cumle="Merhaba Dünya"; // length 13 oluyor ama karakterlerin odası 0-12 numaralanmış 0 dahil olunca 13 oluyor

        char ilkHarf= cumle.charAt(8); // 0 index deki karakteri ver oluyor
        System.out.println("ilkHarf = " + ilkHarf);


    }
}
