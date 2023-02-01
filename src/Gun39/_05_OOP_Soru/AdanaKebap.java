package Gun39._05_OOP_Soru;

public class AdanaKebap implements IFood{

    void marinade() {
        System.out.println("Marine edildi");
    }

    void grill() {
        System.out.println("Izgarada pişirildi");
    }

    @Override
    public void taste() {
        System.out.println("Enfes adana afiyet olsun");
    }

    @Override
    public double ucret() {
        return 15;
    }


}
