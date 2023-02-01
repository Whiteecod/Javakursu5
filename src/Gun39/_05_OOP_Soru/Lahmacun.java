package Gun39._05_OOP_Soru;

public class Lahmacun implements IFood{

    void dough() {
        System.out.println("Hamur açıldı");
    }
    void addMeat(){
        System.out.println("Et eklendi");
    }
    void bake() {
        System.out.println("Pişirildi");
    }

    @Override
    public void taste() {
        System.out.println("Enfes lahmacun Afiyet olsun");
    }

    @Override
    public double ucret() {
        return 7;
    }
}
