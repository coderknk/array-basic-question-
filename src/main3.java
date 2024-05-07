public class main3 {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 2};
        int b = 0;
        int b1 = 0;
        int b2 = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] == 0) {
                b++;
            } else if (a[i] == 1) {
                b1++;
            } else {
                b2++;
            }
        }
        int k = 0;
        for (int i = 0; i < b; i++) {
            a[k++] = 0;
        }
        for (int i = 0; i < b1; i++) {
            a[k++] = 1;
        }
        for (int i = 0; i < b2; i++) {
            a[k++] = 2;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
