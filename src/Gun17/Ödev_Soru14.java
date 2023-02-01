package Gun17;

public class Ödev_Soru14 {
    public static void main(String[] args) {
        // int Array oluşturun ve elemanları : 12,2,5,15,8
        //  En büyük değeri yazdırınız.

        int[] dizi = {5, 6, 8, 12, 14, 19};
        int toplam = 0;

        for (int i = 0; i < dizi.length; i++) {
            int ciftsayi = dizi[i];
            int teksayi=dizi[i];

            if (ciftsayi % 2 == 0) {
                toplam = toplam + ciftsayi;
            }

            if (teksayi %2 == 1) {
                teksayi = teksayi - toplam;
                System.out.println("toplam = " + toplam);
            }
        }




        }
    }











