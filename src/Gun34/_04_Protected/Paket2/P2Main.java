package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {

        P1Hayvan p2=new P1Hayvan();
        p2.ad="Köpek";
        // p1.yas default diğer paketten erişilemez.
        // p1.cinsi protected diğer paketten direk erişemedim
        // p1.renk zaten private.
    }
}
