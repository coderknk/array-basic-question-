
package MAIN8;
public class main8 {
     private static void arr( int [ ]a ,int k){

         int min = a[0]+  k;
         int max = a[a.length-1]+ k;
         int sum = a[a.length-1 -1]- a[0];
         for(int i=1;i<a.length;i++) {
             min = Math.min(min, a[i+1] - k);
             max = Math.max(max, a[i-1] - a[0]);
             if (min < 0)
                 continue;
             sum = Math.min(sum, max - min);
         }
    }
    public static void main(String[] args) {
        int [] a = {1,5,10,15};
        int k = 3;
        arr(a,k);
    }
}
