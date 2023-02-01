package Gun06;

public class _07_StringConcat {
    public static void main(String[] args) {
        // concat : bir string diğerine birleştiriyor

        String s1="Merhaba";
        String s2="Dünya";

        System.out.println("Birleşik hali=" + s1+s2);
        System.out.println("Birleşik hali=" + s1.concat(s2)); // birleşmiş hali
        System.out.println("Birleşik hali=" +s1.concat(" ").concat(s2));
        System.out.println("Birleşik hali=" +s1.concat(" "+s2));
        System.out.println("Birleştirme="+s1.concat(" Venüs"));

    }
}
