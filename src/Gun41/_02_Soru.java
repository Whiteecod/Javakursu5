package Gun41;

import MyFunc.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) {
        // Canlı digital saat yapınız

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true) {
            LocalTime saat = LocalTime.now();
            System.out.print("\r"+saat.format(f1));
            MyFunc.Bekle(1);

        }

    }
}
