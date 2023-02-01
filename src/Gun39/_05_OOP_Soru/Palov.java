package Gun39._05_OOP_Soru;

public class Palov implements IFood{
    void fry(){
        System.out.println("Kızartılıyor");
    }
    void boil() {
        System.out.println("Kaynatılıyor");
    }

    @Override
    public void taste() {
        System.out.println("Enfes pilav Afiyet olsun");
    }

    @Override
    public double ucret() {
        return 10;
    }
}
