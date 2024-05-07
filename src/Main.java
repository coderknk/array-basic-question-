public class Main {

    static void revarr(int a[]) {
        int start =0;
        int end =a.length-1;

        while(start<=end) {
            int k= a[start];
            a[start]=a[end];
            a[end]=k;
            start++;
            end--;
            for(int i=start;i<=end;i++) {

                System.out.println(" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 8, 5, 3, 6};
        revarr(a);
      for(int i:a) {
          System.out.println(i+" ");
      }
    }
}