package Gun30;

public class GununSorusu {
    int a;
    static int b=0;

    void artir(){
        a++;
        b++;
    }


    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;

        GununSorusu gs2=new GununSorusu();
        gs2.a=7;

        // a nın değeri kaç oldu şu anda ? :: Burada verilecek cevap
        // hangi a yi soruyorsunuz olmalıydı.
        // Burada her nesnenin a si var ve gs1 in 5, gs2 nin ise 7 değeri var

        System.out.println("gs1 = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        
        // Soru b nin değeri kaçtır:: tek bir değeri vardır en son değer

        System.out.println("GununSorusu.b = " + GununSorusu.b);

        gs1.artir(); // gs1.a -> 6 , oldu b=2
        gs2.artir(); // gs2.a -> 8 , oldu b=2
        // Soru a nin ve b nin en son değerleri kaçtır.

        System.out.println("gs1 = " + gs1.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("gs2 = " + gs2.b);

        

    }
}
