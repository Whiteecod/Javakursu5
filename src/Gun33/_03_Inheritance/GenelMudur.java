package Gun33._03_Inheritance;

public class GenelMudur extends Calisan{

    double tazminat;

    public GenelMudur(String isim, double maas, double maasKatSayisi, double tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+getTazminat();
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "İsim"   + getIsim() +
                "maas"   + getMaas() +
                "maasKatsaiyi" + getMaasKatSayisi() +
                "tazminat" + getTazminat() +
                "Ödenecek maaş" + maasHesapla() +
                '}';
    }
}
