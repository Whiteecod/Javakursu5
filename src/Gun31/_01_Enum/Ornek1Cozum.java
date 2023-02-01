package Gun31._01_Enum;

public class Ornek1Cozum {

    enum Aylar {
        OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN,
        TEMMUZ, AGOSTOS, EYLUL, EKIM, KASIM, ARALIK
    }

    public static void main(String[] args) {
        Aylar ay = Aylar.MAYIS;

        switch (ay) {
            case SUBAT:
                System.out.println(28);
                break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGOSTOS:
            case EKIM:
            case ARALIK:
                System.out.println(31);
                break;
            case HAZIRAN:
            case KASIM:
            case EYLUL:
                System.out.println(30);
                break;
        }
        if (ay == Aylar.MAYIS) {
            System.out.println("zam yapıldı");
        }

        System.out.println(ay); // toString
        System.out.println("ay = " + ay.name()); // SIMGE olarak
        System.out.println("olarak = " + ay.ordinal());

        for (Aylar a : Aylar.values()) {
            System.out.println(a.name() + " - " + a.ordinal());
        }

        // Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.

//bir sürü girilmesi gereken datayı  tek seferde
// parti halinde giriyoruz,daha sonra kullanması
// da kolay yazması da kolay oluyor
    }
}
