package Gun39._05_OOP_Soru_Hoca;

public class Lahmacun implements IFood{
    @Override
    public void teste() {
        System.out.println("Mükemmel yerli pizza");
    }

    @Override
    public double ucret() {
        return 20;
    }

    void dough() {
        System.out.println("Mayalı hamur hazırlandı");
    }
    void addMeat(){
        System.out.println("Özel kıyma eklendi");
    }

    void bake() {
        System.out.println("Odun ateşinde pişirildi");
    }
}
