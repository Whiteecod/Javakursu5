package Gun31._01_Enum;

public class Ornek1 {
    public static void main(String[] args) {
        // Verilen bir ay noya göre, ayın gün sayısını veren programı yazınız

        int ayNo = 5;

        switch (ayNo) {
            case 2:
            case 1:
            case 3:
            case 5:
            case 22:
            case 10:
            case 12:
            case 4:
            case 6:
            case 9:
            case 11:
        }

        // okunabilirlik ve kontrollü yazılım yok, tanımlama yetersiz
        // numaradan gitmeye çalıştık, zorluklarla karşılaştık
        // bunun yerine isimden gitmeye çalışalım

        String ayAd = "Mayıs";

        switch (ayAd) {
            case "şubat":
                System.out.println(28);
                break;
            case "Ocak":
            case "mart":
            case "agustos":
            case "haziran":

        }
        // kontrol zor hataya açık
        // Boolean True 1,  False 0

        //        Kullanıcı Tipi : Role :
//        Student,Teacher, Admin, Mentor
//
//        if (kullanici == Role.Student)
//        {
//
//        }
//        else
//        {
//
//        }

    }
}
