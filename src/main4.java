public class main4 {

    static void arr(int n, int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (a[i] < b[j]) {
                System.out.println(a[i++]);
            } else if (a[i] > b[j]) {
                System.out.println(b[j++]);
            } else {
                System.out.println(a[i++]);
                j++;
            }
        }

        while (i < n) {
            System.out.println(a[i++]);
        }

        while (j < n) {
            System.out.println(b[j++]);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 3, 6};
        int b[] = {2, 3, 2, 4, 6};

        int n = a.length;

        arr(n, a, b);
    }
}
