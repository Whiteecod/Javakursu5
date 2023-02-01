package Gun29.Soru;

public class Hesap {
    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;

    public void paraYatir(int yatanPara) {
        yatan += yatanPara;
        bakiye += yatanPara;
    }

    public void paraCek(int cekilenPara) {
        cekilen+=cekilenPara;
        bakiye-=cekilenPara;
    }

    @Override
    public String toString() {
        return "\n"+"Yatan Para="+yatan +
                "\n"+"Çekilen Para="+cekilen+
                "\n"+"Mevcut bakiyeniz="+bakiye;
    }
}
