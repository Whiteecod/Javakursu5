package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        // şu ana kadar sayiları birbirine çevirdik
        // Birde yazıların rakamlara çevrilmesi var ve rakamların yazıya çevrilmesi var


        String ad="İsmet";
        String kelimeSayi="65"; // string halde, toplama gibi bir işleme giremez

        int sayiDeger= Integer.parseInt(kelimeSayi); // bu sayiya dönüşüyor
        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        // toplam şu anda int olarak yani sayıdır. Bunu string e nasıl dönüşür?
        String strToplam=Integer.toString(toplam); // buda string e dönüştürür

        System.out.println("strToplam = " + strToplam);


    }
}
