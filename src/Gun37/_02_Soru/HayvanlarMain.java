package Gun37._02_Soru;

import java.util.ArrayList;

public class HayvanlarMain {
    public static void main(String[] args) {
        Duck d=new Duck();
        d.food();
        d.yuzmek();

        Shark s=new Shark();
        s.yuzmek();
        s.food();

        Cat c=new Cat();
        c.food();

        ArrayList<Animal> hayvanlar=new ArrayList<>();
        hayvanlar.add(d);
        hayvanlar.add(d);
        hayvanlar.add(s);


        for (Animal h:hayvanlar) {
            System.out.println("-------------------");


            if (h instanceof Duck){
                System.out.println(((Duck)h).food());
                System.out.println(((Duck)h).yuzmek());
            }
        }
    }
}
