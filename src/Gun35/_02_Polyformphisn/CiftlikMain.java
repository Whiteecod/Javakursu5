package Gun35._02_Polyformphisn;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("karabaş");
//        kopek1.ses(); // kokladı yazcak
//        kopek1.kokladi(); // havaladı yazacak

        Kedi kedi1 = new Kedi("kopuk");
//        kedi1.ses(); // miyavladi
//        kedi1.tirmaladi(); // tırmaladı

//        kopekSesi(kopek1); // havladı
//        kediSesi(kedi1); // miyavladı

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);
        /**************************************/
        //Referans tipi   // nesne tipi
        Hayvan hayvan1 = new Hayvan("ördek"); // hayvanlardan 1 hayvan
        Hayvan hayvan2 = new Kopek("kangal");
        Hayvan hayvan3 = new Kedi("boncuk");

        System.out.println("--------------------------");
        hayvan1.ses(); // genel hayvan ses çıkardi
        hayvan2.ses(); // köpek hayvan havladı//
        hayvan3.ses(); // kedi hayvanı, miyavladi
        System.out.println("--------------------------");

        hayvan2.ses(); // kopek de olsa hayvan referansi
        // sebebiyle metodlar kısıtlı

        ((Kopek) hayvan2).kokladi();

        // artık diğer metodları kullanabilirim.
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü

        // Setlerden HasSet
        // Maplerden HashMAp
        // Listlerden ArrayList

//        Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//        şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.


    }

    public static void kopekSesi(Kopek kopek) {
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi) {
        kedi.ses();
    }

    public static void hayvanSesi(Hayvan hayvan) {
        // buraya hem kedi geliyor hem kopek geliyor
        hayvan.ses();
        // bir classın aslında kim olduğunu bulma yöntemi
        if (hayvan instanceof Kopek) // hayvan aslında kopek mi
            ((Kopek)hayvan).kokladi();

        if (hayvan instanceof  Kedi) // hayvan aslında kedi mi
            ((Kedi)hayvan).tirmaladi();
    }
}
