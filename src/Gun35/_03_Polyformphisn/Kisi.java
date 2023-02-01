package Gun35._03_Polyformphisn;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGörevi(gorevi);
    }

    public static void kimlikYaz(Kisi gelenKisi) {
        System.out.println("\n******** Kimlik Belgesi ***********");
        System.out.println("Ad=" + gelenKisi.getAd());
        System.out.println("Soyad=" + gelenKisi.getSoyad());
        System.out.println("Görevi=" + gelenKisi.getGörevi());

        if (gelenKisi instanceof Ogrenci)
            System.out.println("Şubesi:" + ((Ogrenci)gelenKisi).getSubesi());
        else if (gelenKisi instanceof Calisan) {
            System.out.println("Departmanı:" + ((Calisan)gelenKisi).getDepartmani());
        }
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGörevi() {
        return gorevi;
    }

    public void setGörevi(String görevi) {
        this.gorevi = görevi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", görevi='" + gorevi + '\'' +
                '}';
    }


}
