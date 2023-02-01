package While_DoWhile_for_break_continue;

public class deneme2 {
    public static void main(String[] args) {
        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        int[] list2 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};

        System.out.println(isUnique(list));
        System.out.println(isUnique(list2));
    }

    public static boolean isUnique(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i != j && dizi[i] == dizi[j])
                    return false;
            }
        }
        return true;
    }
}
