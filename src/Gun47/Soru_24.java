package Gun47;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.awt.*;

public class Soru_24 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

//        // b) small yazar
//        for (int i = 0; i <2 ; i++) {
//            for (int j = 0; j <i ; j++) { // 0 çalışmaz , 1 ken çalışır
//                System.out.println(shirts[i][j] + ":");
//
//            }
//        }

        for (String[] ca:shirts){
            for (String c: ca)
                System.out.println(c + ":");
        }
    }

}
