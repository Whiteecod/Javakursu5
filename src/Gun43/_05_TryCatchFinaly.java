package Gun43;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {
        long startTime=0;
        String str="";
        try {
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önce ki kısım");
            char ilkHarf=str.charAt(0);
            System.out.println("Hatadan sonra ki kısım");
            // hata olma olasılığının olduğu kodlar

        }
        catch (Exception ex)
        {
            System.out.println("Catch bloğu çalıştı");
            // hata olduğunda yapılacaklar
        }
        finally // hata olsada çalışır, olmasada çalışacak kısım, bu bölüm yukardaki süreçle
                // olduğunu göstermek için finally içinde yazılır
        {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("Gecen sure = " + gecenSure);
            System.out.println("Try-catch bloğuyla ilgili son yapılacaklar");
        }

        System.out.println("Diğer çalışan kodlar");

        System.out.println("program sonu");
    }
}
