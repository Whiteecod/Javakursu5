package Gun41;

import MyFunc.MyFunc;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _03_Odev {
    public static void main(String[] args) {
        // TODO : // Alınan saati geriye doğru saniye saniye saydırınız

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("kk:mm:ss");
        while (true) {

            LocalTime now = LocalTime.now();
            LocalTime back = now.minusSeconds(1);

            MyFunc.Bekle(1);
            System.out.print("\r" + back.format(f1));

        }

    }
}




