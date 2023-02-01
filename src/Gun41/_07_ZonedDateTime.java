package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    public static void main(String[] args) {

        ZonedDateTime ztd=ZonedDateTime.now();
        // şu anda benim bulunduğuım yani şu an daki windows un bulunduğu zamanı default zamanı verdi.

        System.out.println("ztd = " + ztd);

        Set<String> zamanBolgeleri=ZoneId.getAvailableZoneIds();

        for (String z : zamanBolgeleri ) {

            if (z.toLowerCase().contains("Amst"))
            System.out.println("z = " + z);
        }
        ZoneId zoneIdAmsterdam=ZoneId.of("Europe/Amsterdam");
        ZonedDateTime zoneAmsterdam= ZonedDateTime.now(zoneIdAmsterdam);
        System.out.println("zoneAmsterdam = " + zoneAmsterdam);

        ZoneId zoneIdLondon=ZoneId.of("Europe/London");
        ZonedDateTime saatLondon= ZonedDateTime.now(zoneIdLondon);
        System.out.println("zoneLondon = " + zoneIdLondon);
    }
}
