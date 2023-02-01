package Gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {
        // IsEmpty: Bir stringin içinde bir şey var mı yok mu boolean olarak verir

        String s1="Merhaba";

        System.out.println("s1.isEmpty() = " + s1.isEmpty()); //

        String s2=" "; // Boşluk karakteri aynı a gibi olarak algılamaktadır.
        System.out.println("s2.isEmpty() = " + s2.isEmpty());

        String s3="";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());


    }
}
