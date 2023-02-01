package Gun39._05_OOP_Soru_Hoca;

public class Palov implements IFood{
    @Override
    public void teste() {
        System.out.println("Çocukların vazgeçilmezi");
    }

    @Override
    public double ucret() {
        return 20;
    }

    void fry() {
        System.out.println("Pirinç ve şehriye kavruldu");
    }
    void boil() {
        System.out.println("Kısık ateşte pişirildi");
    }
}
