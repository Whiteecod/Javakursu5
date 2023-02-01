package Gun38._01_Abstract;

import Gun37._01_Soru.Bus;

public class otoMain {
    public static void main(String[] args) {

        Ford f=new Ford("Mustang",1995,4);

        // IBinekOto ib=new IBinekOto(); // interface lerden NESNE oluşturulamaz
        // sadece referans tip olabilirler

        // Referans olabiliyor
        BinekOto bo=new Ford("Mustang",1995,4);


    }
}
