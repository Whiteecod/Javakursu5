package Gun29._03_Protected.Bir;

import javax.print.Doc;

public class HastaneAnkara {
    public static void main(String[] args) {
       Doctor dok1=new Doctor();
       dok1.adi="İsmet";
       dok1.bolumu="Dahiliye";
       dok1.hastaneAdi="Ankara Hastanesi";
       //dok1.SicilNo private

        Doctor dok2=new Doctor("Mehmet");
    }
}
