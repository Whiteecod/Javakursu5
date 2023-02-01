package Gun35._01_Final.classFinal;

import Gun35._01_Final.attribute.Tasit;

public class ArabaMain {
    public static void main(String[] args) {
        Tasitlar t1=new Tasitlar();
        t1.model="Opel";

        Tasitlar t2=new Tasitlar();
        t2.model="Opel";
        // kullanım kısmında bir sınırlama yok

        // Class final olursa eğer main de birden
        // fazla çağırılabiliniyor. fakat baska
        // class a extend edilemez
    }
}
