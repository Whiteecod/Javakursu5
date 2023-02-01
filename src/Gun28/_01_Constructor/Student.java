package Gun28._01_Constructor;

public class Student {
    int id;
    String name;
    String surName;
    int sinifi;

    public Student() { // Yapıcı methodlar,
        System.out.println("Nesne oluşturuldu");
    }
    public Student(int id, String name, String surName, int sinifi) { // Yapıcı methodlar,
        this.id=id;
        this.name=name;
        this.surName=surName;
        this.sinifi=sinifi;
    }
    public Student(int id, String name, String surName) { // Yapıcı methodlar,
        this(id,name,surName,0); // This öğrenci methodunun kendisi

//        this.id = id;
//        this.name = name;
//        this.surName = surName;
//        this.sinifi = 0;
    }
}
