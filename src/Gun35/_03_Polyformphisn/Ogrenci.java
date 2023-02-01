package Gun35._03_Polyformphisn;

public class Ogrenci extends Kisi{
    private String subesi;

    public Ogrenci(String ad, String soyad, String görevi,String subesi) {
        super(ad, soyad, görevi);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }


}
