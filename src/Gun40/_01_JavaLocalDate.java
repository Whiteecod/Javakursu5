package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sadece gun ay yıl bilgisini tutar.

        LocalDate tarih = LocalDate.now(); // şu andaki zamanı vverdi
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih = " + tarih.getMonthValue());
        System.out.println("tarih.getChronology() = " + tarih.getChronology());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());

        // kendisindeki hazır formatlara bakalım
        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Full = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        // Localde aldığım tarihi istediğim ülkenin formatına göre, diline göre nasıl gösterirdim?
        // Örneğin localdeki saati almanyaya nasıl gösteririz
        System.out.println("Full almanya gösterimi = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        // Olmayan bir ülke olduğunda ne yapacağız
        Locale[] kullanilabilinirlokaller = Locale.getAvailableLocales();

        for (Locale l : kullanilabilinirlokaller) {
            if (l.getDisplayCountry().toLowerCase().contains("chi")) ;

            System.out.print("Dil = " + l.getDisplayLanguage());
            System.out.print(", Ülke = " + l.getDisplayCountry());
            System.out.println(", " + l.getLanguage());
            System.out.println(" - " + l.getCountry());
        }

        Locale lokalCince = new Locale("zh", "CN");
        System.out.println("Full cince gösterimi = \n" +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        System.out.println("\n***************İstediğim formatta gösterim**************");
        // istediğim formatta gösterim
        System.out.println("Tarih =" + tarih);

        DateTimeFormatter ozelFormat1 = DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println("tarih.format(ozelFormat1) = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2 = DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih.format(ozelFormat1) = " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3 = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih.format(ozelFormat1) = " + tarih.format(ozelFormat3));

        System.out.println("ozel format ve loc EEEE dd.MM.yyyy" + tarih.format(ozelFormat3.withLocale(Locale.UK)));

        LocalDate tarih1= LocalDate.of(2000,5,20);
        LocalDate tarih2= LocalDate.of(1999, Month.MARCH,12);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));
//        y--  yıl
//        M--  Yıl için de ay
//        w--  yil içinde hafta
//        W--  ay içinde hafta
//        D--  Yıl içinde gün
//        d-- ay içinde gün
//        F-- ay içinde
//

    }
}
