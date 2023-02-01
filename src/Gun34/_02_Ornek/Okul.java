package Gun34._02_Ornek;

public class Okul {
    public static void main(String[] args) {

        LiseOgrencisi l1=new LiseOgrencisi("İsmet temur", OgrTip.LISE,"SAY");
        LiseOgrencisi l2=new LiseOgrencisi("Mehmet Yıldız", OgrTip.LISE,"SÖZ");
        ilkOgrencisi İ1=new ilkOgrencisi("Ayşe Bayrak", OgrTip.ILK,"Satranç");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("İ1 = " + İ1);


    }
}
