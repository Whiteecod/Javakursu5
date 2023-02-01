package Gun39._05_OOP_Soru;

public class Borsh implements IFood{

    void boil() {
        System.out.println("Etler sebzeler eklendi");
    }
    void eatTomorrow() {
        System.out.println("Kaynatıldı");
    }

    @Override
    public void taste() {
        System.out.println("Enfes borsh Afiyet olsun");
    }

    @Override
    public double ucret() {
        return 10;
    }
}
