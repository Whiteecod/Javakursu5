package Abstract_Odev._01_Soru;

public class Main {
    public static void main(String[] args) {

        Lions l=new Lions();
        l.talk();
        l.walk();

        HomeCats hc=new HomeCats();
        hc.talk();
        hc.walk();

        Tigers t=new Tigers();
        t.talk();
        t.walk();
    }
}
