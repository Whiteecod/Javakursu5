package Gun35._03_Polyformphisn;

public class OkulMain {
    public static void main(String[] args) {


        Ogrenci ogr1 = new Ogrenci("Ayşe", "Yılmaz", "Öğrenci", "5A");

        Calisan cls1 = new Calisan("Ali", "Yılmaz", "Yazılım", "BIM");

//        System.out.println("cls1 = " + cls1);
//        System.out.println("ogr1 = " + ogr1);
//        her bir class kendi toStringini kullanıyor bu yüzden tek metod değil
         Kisi.kimlikYaz(ogr1);
         Kisi.kimlikYaz(cls1);

    }

}
