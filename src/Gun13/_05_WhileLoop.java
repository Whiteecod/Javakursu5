package Gun13;

public class _05_WhileLoop {
    public static void main(String[] args) {
         // 100 e kadar olan sayıların toplamını bulunuz

        // - Sayi girişi, sayi okuma var mı ? YOK
        // 1+2+3+4+5+6+7+8+9........99+100

        int toplam=0;
        int sayac=1;
        while (sayac<=100) {

            toplam=toplam+sayac;

            sayac++;
        }

        System.out.println(sayac+".Toplam=" + toplam);

    }
}
