package Gun45;

public class Soru_01_DigerDurum {
    public static void main(String[] args) {
        String names[] = {"Thomas","Peter","Joseph"};
        String pwd[] = new String[3];
        int idx=0;

        for (String n : names)
        try {
             {
                pwd[idx]= n.substring(2,6);
                System.out.println(pwd[idx]);
                idx++;
            }

        }
        catch (Exception e) {
            System.out.println("Invalid Name");
        }

        // for u dışarı aldığımız da - omas,Invalid Name, seph yazacaktır.
        // her işlem de try catch i çalıştıracaktır
    }
}
