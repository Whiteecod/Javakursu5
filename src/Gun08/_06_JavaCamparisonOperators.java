package Gun08;

public class _06_JavaCamparisonOperators {
    public static void main(String[] args) {
        int a=50;
        int b=50;

        // = atama işareti, == eşit mi ? demektir.

        System.out.println("a b ye eşit mi ? " + (a==b)); // true çıkar
        System.out.println("a b ye farklı mi ? " + (a != b)); // false
        System.out.println("a b den büyük mü ? " + (a>b));  // false
        System.out.println("a b den küçük mü ? " + (a<b)); // false
        System.out.println("a b den büyük veya eşit mi ? " + (a>=b)); // true
        System.out.println("a b den küçük veya eşit mi ? " + (a<=b)); // true
    }
}
