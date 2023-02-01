package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        // Period 2 tarih arasında ki farkı gösterir.
        // LocalDate ler için kullanılır.

        LocalDate dogumTarihi= LocalDate.of(1992,12,27);
        LocalDate buGun= LocalDate.now();

        Period fark = Period.between(dogumTarihi,buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears() + " Yaşındasınız ");

        /**********************************************/

        Period period3Gun= Period.ofDays(3);
        Period period3Ay= Period.ofMonths(3);
        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra= buGun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra = buGun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);

        /*****************************************/

        LocalDate kursBaslangic= LocalDate.of(2022,10,31);
        Period kursBitis= Period.ofMonths(6);
        LocalDate altiAySonra= kursBaslangic.plus(kursBitis);
        System.out.println("altiAySonra = " + altiAySonra);
        System.out.println("altiAySonra.getDayOfWeek() = " + altiAySonra.getDayOfWeek());

        // Kursun bitmesine ne kadar süre kaldı
        Period neKadarSureKaldi = Period.between(buGun,altiAySonra);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        // Kurs ne kadar süredir devam ediyor
        Period suAnaKadarDevamSuresi= Period.between(kursBaslangic,buGun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);

    }
}
