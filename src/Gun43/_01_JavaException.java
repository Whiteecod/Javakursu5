package Gun43;

public class _01_JavaException {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başladı");
        String kelime=""; // önce ; koymadık bu compile error
        char harf=kelime.charAt(3); // bu satiri en son ekledik, bu RUNTIME error
        System.out.println("program bitti");
    }
}

// daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// derleme zamanı yani COMPILE ERROR, Exception diyoruz.

// Program çalıştıktan sonra çalışma zamanı içerisinde ki hatalara
// çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.