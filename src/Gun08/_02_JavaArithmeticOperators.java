package Gun08;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac = 0;

        sayac = sayac + 1; // sayacın değerini bir tane arttırıyor : 1
        sayac++;       // sayacın değerini 1 tane arttırır         : 2
        ++sayac;       // sayacın değerini 1 tane arttırıyor       : 3

        sayac=sayac-1;  // aynı şekilde azaltma değeri oluyor : 2
        sayac--;        //  --    --      --     --     --    : 1
        --sayac;        //  --    --      --     --     --    : 0

        System.out.println("sayac = "+ sayac);

        /************************************/
        int toplam= 5 + sayac;  // toplam 5 olur

        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

        toplam = 5 + sayac++; // toplam = 5+sayac ve sayac=sayac+1

        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

        toplam = 5 + ++sayac; //

        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

        // Özet: ++lar sağda ise önce işlem sonra artış olur.
        //       ++lar solda ise önce artış sonra işlem olur.


    }
}
