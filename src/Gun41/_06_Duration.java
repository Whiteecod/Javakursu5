package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        // Duration : hem LocalTime hemde LocalDateTime arasnda ki farkı verir

        // LocalTime
        LocalTime dersBaslangic = LocalTime.of(19, 0, 0);
        LocalTime dersBitis = LocalTime.of(22, 0, 0);

        Duration GunlukDersSuresi = Duration.between(dersBaslangic, dersBitis);

        System.out.println("GunlukDersSuresi.toHours() = " + GunlukDersSuresi.toHours()); // farkın toplam saat hali
        System.out.println("GunlukDersSuresi.toMinutes() = " + GunlukDersSuresi.toMinutes()); // farkın toplam dakika halini
        System.out.println("GunlukDersSuresi.toMillis() = " + GunlukDersSuresi.toMillis()); // farkın toplam milisaniye halini

        // LocalDateTime  *** 2 tarih - saat arasında ki farkı ***
        LocalDateTime from = LocalDateTime.of(2023,1,1, 0,0);
        LocalDateTime to= LocalDateTime.now(); // bugün

        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman = " + farkZaman.toDays()); // farkın toplam gunu
        System.out.println("farkZaman = " + farkZaman.toHours()); // farkın toplam saati
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes()); // farkın toplam dakikası



//        1 saat 60 dakika
//        1 dakika 60 saniye
//        180 * 60 * =  100 000 milisaniye
//        1000 -> mili
//        100000 ->micro
//        100 000 000 ->nano

    }
}
