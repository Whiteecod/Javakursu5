package Gun09;

public class ÖDEVDENEME {
    public static void main(String[] args) {
        String sg="Merhaba Ben Java";

        System.out.println("sg.chart = " + sg.charAt(0)+
                "."+sg.charAt(sg.indexOf(" ")+1)+"."
                +sg.charAt(sg.lastIndexOf("a")-3)+".");
    }
}
