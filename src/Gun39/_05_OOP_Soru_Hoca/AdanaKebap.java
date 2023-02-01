package Gun39._05_OOP_Soru_Hoca;

public class AdanaKebap implements IFood{

    @Override
    public void teste() {
        System.out.println("Etin en güzel hallerinden biri");
    }

    @Override
    public double ucret() {
        return 75;
    }
    void marine() {
        System.out.println("Et dünden özel baharatlarla terbiye edildi");
    }
    void grill() {
        System.out.println("Kömür ateşinde yavaş pişirildi");
    }
}
