package Gun33._02_Inheritance;

import com.sun.org.apache.xpath.internal.operations.Or;

public class HayvanatBahseci {
//    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.( ses çıkardı )

    public static void main(String[] args) {

        Kopek kopek1 = new Kopek("Beyaz", 50, "Kangal");
        kopek1.konustu();
        Kedi kedi1 = new Kedi("Duman", 25, "skotiş");
        kedi1.konustu();
        Ordek ord1=new Ordek("Beyaz",15,"Ordek",90);
        ord1.konustu();
        Yilan yln=new Yilan("Kara",5,"karamamba",20);
        yln.konustu();

        System.out.println("yln = " + yln);


    }
}
