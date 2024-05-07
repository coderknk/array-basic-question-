public class main2 {

    static void arr(int a[]){

        for (int j : a) {
            int max = 0;
            if (max < a[0]) {
                max = j;
            }
            int min = 999;
            if (min > j) {
                min = j;

            }
        }
    }

    public static void main(String[] args) {
        int []a= {2,3,22,45,34};
        arr(a);
        for(int x:a){
            System.out.println(x);
        }
    }

}

