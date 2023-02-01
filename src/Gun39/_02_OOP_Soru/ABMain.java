package Gun39._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {


        A a = new A();
        System.out.println("A.mesaj = " + A.mesaj); // A dan merhaba yazar

        B b = new B();
        System.out.println("A.mesaj = " + A.mesaj); // B den merhaba gelir static olduğu için

        A a2 = new A();
        System.out.println("A.mesaj = " + A.mesaj); // tekrar yazdırılmak istediğin de durum
        // değişmez static olduğundan dolayı yine B yi yazar

        A a3= new A();
        System.out.println("A.mesaj = " + A.mesaj);
    }
}
