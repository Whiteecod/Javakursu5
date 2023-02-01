package Gun32._02_Encapsulation;

public class ArabaMain {
    // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bgunu kontrol ediniz.

    public static void main(String[] args) {
         Araba a=new Araba();

         a.setRenk("Kırmızı");
         a.setModel(2022);
         a.setKapiSayisi(4);
         a.setMotorHacmi(1.4);

         Araba a2=new Araba("Mavi",2030,2.0,5);

        System.out.println("a2 = " + a2);

        System.out.println("a = " + a);
        System.out.println("a.getKapiSayisi() = " + a.getKapiSayisi());
    }
}
