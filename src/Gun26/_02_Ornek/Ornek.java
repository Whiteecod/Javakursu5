package Gun26._02_Ornek;

import java.util.ArrayList;
import java.util.Arrays;

public class Ornek {
    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.

    public static void main(String[] args) {
        Person cal1=new Person();
        cal1.name="Hatice";
        cal1.surName="Demir";
        cal1.age=30;

        Person cal2=new Person();
        cal2.name="Muhammed";
        cal2.surName="Gürdal";
        cal2.age=35;

        // 1. YÖNTEM
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.name = " + cal1.surName);
        System.out.println("cal1.name = " + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.name = " + cal2.surName);
        System.out.println("cal2.name = " + cal2.age);

        // 2. YÖNTEM NORMAL METHOD YÖNTEMİ
        bilgiYazdir(cal1);
        bilgiYazdir(cal2);

        // 3. YÖNTEM metodu ait olduğu class dan çağırıyoruz

        cal1.bilgiYazdir();
        cal2.bilgiYazdir();

//        int[] dizi=new int[5];
//        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
//
//        ArrayList<Integer> liste=new ArrayList<>();
//        System.out.println("liste = " + liste.toString());

        System.out.println("cal1 = " + cal1);
        cal1.getBirthYear();
        System.out.println(cal2.getBirthYear2());
        cal1.getInitials();


    }

    public static void bilgiYazdir(Person cal) {
        System.out.println("cal2.name = " + cal.name);
        System.out.println("cal2.name = " + cal.surName);
        System.out.println("cal2.name = " + cal.age);
    }
}
