import com.sun.jdi.PathSearchingVirtualMachine;

public class main7 {


    public static void arr(int[] a) {
        int maxsum = 0;
        int minsum = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            maxsum = Math.max(maxsum, sum);
            minsum = Math.min(minsum, sum);


            if (maxsum > minsum) {
                maxsum = minsum;
            }
            if (minsum < maxsum) {
                minsum = 0;

            }

        }
        System.out.println( "max :"+maxsum);
        System.out.println("min :"+minsum);

    }


    public static void main(String[] args) {
        int[] a = {  -2, -3, 4, 2, 1, 5, -3 };
        arr(a);

    }


    }
