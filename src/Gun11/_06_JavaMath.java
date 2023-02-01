package Gun11;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a nın mutlak değeri =" + Math.abs(-12)); // 12
        System.out.println("a ve b den büyük olanı = " + Math.max(a,b)); // 4
        System.out.println("a ve b den küçük olanı = " + Math.min(a,b)); // -12
        System.out.println("2 nin 3. Kuvveti       = " + Math.pow(2,3)); // 8
        System.out.println("b nin karakökü         = " + Math.sqrt(b)); // 2
        System.out.println("raund 3.1              = " + Math.round(3.1)); // 3 // Yuvarlama demek
        System.out.println("raund 3.5              = " + Math.round(3.5)); // 4 // Yuvarlama demek

        System.out.println("ceil 3.1 = " + Math.ceil(3.1)); // Bu rakamdan büyük en yakın tam sayi yani 4.0
        System.out.println("ceil 3.5 = " + Math.ceil(3.5)); // Bu rakamdan büyük en yakın tam sayi yani 4.0
        System.out.println("ceil 3.1 = " + Math.floor(3.1)); // Bu rakamdan Küçük en yakın tam sayi yani 3.0
        System.out.println("ceil 3.5 = " + Math.floor(3.5)); // Bu rakamdan Küçük en yakın tam sayi yani 3.0

        int enb=Gun20._01_JavaMethod.enbBul(a,b);
    }
}
