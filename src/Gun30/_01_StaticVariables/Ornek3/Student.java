package Gun30._01_StaticVariables.Ornek3;

public class Student {
    int id;
    String fullName;

    static int sayac=1;


    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Student(String fullName) {
        this.id = sayac++;
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
