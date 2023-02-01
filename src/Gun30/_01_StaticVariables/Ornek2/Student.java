package Gun30._01_StaticVariables.Ornek2;

public class Student {
    int id;
    String fullName;

    static int sayac=1;
    // Static olmadan her zaman 0 la başlıyordur
    // Static olduğunda ise artık bir tane olduğundan
    // değerini korudu ve her 1 tane arttırdı.
    // tün nesnelere ait olan aynı(okul adı gibi) bilgileri veya
    // sayac gibi işlemler için static kullanılır.


    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Student(String fullName) {
        this.id = sayac++; // önce var olan değer
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
