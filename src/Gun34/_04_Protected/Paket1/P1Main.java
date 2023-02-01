package Gun34._04_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {

        P1Hayvan p1=new P1Hayvan();
        p1.ad="Kara Kedi"; // public erişildi
        p1.yas=2; // default erişildi
        p1.cinsi="Tekir"; // protected erişildi.
        // p1.renk // private olduğu için erişilemedi.
    }
}
