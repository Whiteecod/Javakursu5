package Gun44;

public class Soru_03_ {
    public static void main(String[] args) {
        int[] stack= {10,20,30}; // 0,1,2 indexler bu şekilde
        int size=3;
        int idx=0;

        do {
            idx++;

        } while (idx < size -1);

        System.out.println(stack[idx]);
    }
}
