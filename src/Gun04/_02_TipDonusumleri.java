package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=100;
        byte ogrNot3=100;
        byte ogrNot4=100;

        int toplam=ogrNot1+ogrNot2+ogrNot3+ogrNot4; // Byte -> int atınca problem çıkarmadı
        // çünkü byte için hafızada ayrılan alan, zaten int e sığar, sığdığı için ben kabul ederim
        // çünkü veri kaybı olma ihtimali hiç yok ( GENİŞLETME VAR - Widening Casting ) )

        ogrNot1 = (byte)toplam; // int -> byte atınca dur bakalım dedi ( Daraltma Var - Norrow Casting)
        // Büyük hafıza için ayrılmış bir alanı,
        // Küçük hafıza ayrılmış alana atma işlemi var.
        // veri kaybı ihtimali var mı ?





    }
}
