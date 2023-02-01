package Gun28._01_Constructor;

public class School {

    public static void main(String[] args) {

        Student std=new Student(); // nesne oluşma ani,

        // 1. YOL
        std.id=1; // özelliklerinin değerleri veriliyor
        std.name="İsmet";
        std.surName="Temur";
        std.sinifi=5;
        System.out.println("std.name = " + std.name);

        // 2. YOL
        Student std2=new Student(1,"Mehmet","Yılmaz",5);
        System.out.println("std2 = " + std2.name);

        // 3. YOL
        Student std3=new Student(2,"Ayşe","Bayrak");
        System.out.println("std3.name = " + std3.name);
    }
}
