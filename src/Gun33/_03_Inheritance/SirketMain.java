package Gun33._03_Inheritance;

public class SirketMain {
//    Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
//    consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
//    GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
//    GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
//    SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
//    maaşları hesaplatıp, bordroyu yazdırınız.

    public static void main(String[] args) {

        Calisan cal1 = new Calisan("Kubilay", 10000, 1.2);
        System.out.println("cal1 = " + cal1);
        GenelMudur gnl1 = new GenelMudur("İsmet", 30000, 1.5, 1500);
        System.out.println("gnl1 = " + gnl1);


    }
}
