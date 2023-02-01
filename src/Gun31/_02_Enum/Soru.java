package Gun31._02_Enum;

public class Soru {
//    enum Role {ADMIN, MUDUR, SATIS, PERSONEL, TESTER}
//    enum Statu {AKTIF, PASIF}

    public static void main(String[] args) {

        User u1=new User("ismet",Role.ADMIN,Statu.AKTIF);
        User u2=new User("mehmet",Role.MUDUR,Statu.PASIF);
        User u3=new User("Ayşe",Role.SATIS,Statu.AKTIF);
        User u4=new User("Kubilay",Role.TESTER,Statu.AKTIF);

        userSil(u1);
        userSil(u2);
        userSil(u3);
        userSil(u4);

        System.out.println("u1 = " + u1);

    }
    public static void userSil(User user) {
        if (user.role == Role.ADMIN) {
            System.out.println(user.username +"Admin silinemez");
        }
    }
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim
}
