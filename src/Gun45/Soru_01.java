package Gun45;

public class Soru_01 {
    public static void main(String[] args) {
        String names[] = {"Thomas","Peter","Joseph"};
        String pwd[] = new String[3];
        int idx=0;

        try {
            for (String n : names) {
                pwd[idx]= n.substring(2,6);
                System.out.println(pwd[idx]);
                idx++;
            }

        }
        catch (Exception e) {
            System.out.println("Invalid Name");
        }

        // burada ki durum names de ki thomas 2 - 5 i aldıktan sonra Peter isminin
        // 2-5 ini alacağı zaman 2-5 olmadığı için catch e düşüyor ve runtime exception oluyor
        // dolayısla burada omas yazdıktan sonra exception aldığından İnvalid name yazıcak
        // omas - Invalid name
    }
}
