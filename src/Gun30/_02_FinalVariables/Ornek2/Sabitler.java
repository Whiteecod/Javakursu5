package Gun30._02_FinalVariables.Ornek2;

public class Sabitler {
    final static int birGundekiSaatSayisi=24;
    final static int birSaatdekiDakSayisi=60;
    final static int birDakikadakiSanSayisi=60;


    public  static int hesapla(int gun, int saat, int dakika) {
        int toplamSaniye =
                gun
                        * birGundekiSaatSayisi
                        * birSaatdekiDakSayisi
                        * birDakikadakiSanSayisi
                        +
                        saat
                                * birSaatdekiDakSayisi
                                * birDakikadakiSanSayisi
                        +
                        dakika
                                * birDakikadakiSanSayisi;
        return toplamSaniye;
    }


}
