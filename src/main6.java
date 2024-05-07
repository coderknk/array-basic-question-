public class main6 {


    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        int x= a[a.length-1];
        for(int i=a.length;i<0;i--){
            a[i]=a[i-1];

        }
        a[0]=x;
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }

    }

}
