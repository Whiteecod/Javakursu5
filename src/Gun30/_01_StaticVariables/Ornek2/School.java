package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student sdt1=new Student(1,"İsmet Temur");
        Student sdt2=new Student(2,"Mehmet Yılmaz");
        Student sdt3=new Student(3,"Feyza Demir");

        // Problem : Hem id yi takip etmek zorundayım.
        // hemde hata olasılığı yüksek. ( Aynı numarayı verme gibi )


        Student sdt10=new Student("İsmet Temur");
        Student sdt11=new Student("Mehmet Yılmaz");
        Student sdt12=new Student("Feyza Demir");
        System.out.println("sdt10 = " + sdt10);
        System.out.println("sdt11 = " + sdt11);
        System.out.println("sdt12 = " + sdt12);






    }
}
