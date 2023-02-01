package Gun13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("Ay numarası girin=");

        int sayi = Integer.parseInt(oku.next());

        switch (sayi) {
            case 1:
                System.out.println("30"); break;
            case 2:
                System.out.println("28");break;
            case 3:
                System.out.println("31");break;
            case 4:
                System.out.println("30");break;
            case 5:
                System.out.println("31");break;
            case 6:
                System.out.println("30");break;
            case 7:
                System.out.println("31");break;
            case 8:
                System.out.println("31");break;
            case 9:
                System.out.println("30");break;
            case 10:
                System.out.println("31");break;
            case 11:
                System.out.println("31");break;
            case 12:
            default:
                System.out.println("Hatalı Ay NO");


                // YÖNTEM 2. KISA YOL

                switch (sayi) {
                    case 2:
                        System.out.println("28");
                        break;


                    case 1:

                    case 4:

                    case 6:

                    case 9:
                        System.out.println("30");
                        break;


                    case 5:

                    case 7:

                    case 8:

                    case 3:

                    case 10:

                    case 11:

                    case 12:
                        System.out.println("31");
                    default:
                        System.out.println("Hatalı Ay NO");
                }

        }
    }
}
