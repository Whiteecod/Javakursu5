package Gun24;

import java.util.HashMap;

public class _03_JavaMap {
    public static void main(String[] args) {
        // Bir Kartvizit uygulamasını 2 kişi için yapınız
        HashMap<String, String> uKartVizit = new HashMap<>();
        uKartVizit.put("isim","Ugur Yılmaz");
        uKartVizit.put("email","ugur@gmail.com");
        uKartVizit.put("adres","Çekmeköy/İstanbul");
        uKartVizit.put("telefon","05304554433");

        System.out.println("uKartVizit.get(\"isim\") = " + uKartVizit.get("isim"));
        System.out.println("uKartVizit = " + uKartVizit.get("telefon"));

        HashMap<String, String> aKartVizit = new HashMap<>();
        aKartVizit.put("isim","Ayşe Bayrak");
        aKartVizit.put("email","ayse@gmail.com");
        aKartVizit.put("adres","Şişli/İstanbul");
        aKartVizit.put("telefon","05354334433");

        HashMap<String, HashMap<String,String> > kartvizitler = new HashMap<>();
        kartvizitler.put("ugur", uKartVizit);
        kartvizitler.put("ayse", aKartVizit);

        System.out.println("kartvizitler = " + kartvizitler.get("ugur"));
        System.out.println("kartvizitler.get(\"ayşe\") = " + kartvizitler.get("ayse"));

        System.out.println("kartvizitler.get(\"ayse\").get(\"adres\") = " + kartvizitler.get("ayse").get("adres"));







    }
}
