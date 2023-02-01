package Gun38._02_Abstract;

public class Main {
    public static void main(String[] args) {

        Dikdörtgen d=new Dikdörtgen(5,4);
        d.setName("Yeni dikdörtgen");
        d.ciz();
        System.out.println("d = " + d);
        Daire daire=new Daire(4);
        d.setName("Yeni Daire");
        d.ciz();
        System.out.println("daire = " + daire);


    }
}
