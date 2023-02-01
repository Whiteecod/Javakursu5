package Gun45;

public class Soru_03 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+ " ");
            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("Work Done");
           // break; // Break olmadığı zaman C yi yazıyor ve sonrasında continue geldiği için
            // sonrasını pass geçiriyor Work done yazdırmıyor.
            // A WORK DONE - B WORK DONE - C - D WORK DONE şeklinde yazıyor.
        }


    }
}
