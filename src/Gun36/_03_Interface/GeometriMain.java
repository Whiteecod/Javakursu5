package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {

        Cember c = new Cember();
        c.ciz(); // cember çizildi

        Dikdortgen d = new Dikdortgen();
        d.ciz(); // dikdörtgen çizildi

        // interfacelerden nesne üretilme fakat referans tipi
        // oluşturulabilir. bu bize Polymophsn sağladi
        ICizdirir c2 = new Cember();
        c2.ciz(); // çember çizildi
        // direk olarak sadece interface deki
        // ismi verilmiş olanlar metodlara

    }
}
