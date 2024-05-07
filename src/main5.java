import java.util.*;

public class main5 {

    static void arr(int n , int i,  int j , int []a,int []b ){
        while(i < j){
            if (a[i]>b[j]){
                System.out.println(a[i++]);
                if (b[j]>a[i]){
                    System.out.println(b[j++]);
                }
 while (i<j){
    System.out.println(a[i++]);j--;

                }
 while (j<i){
     System.out.println(a[j++]);
     i--;

 }



            }

        }
    }


public static void main(String[] args) {
        int []a = { 1,2,3,4,5,6,7,8,9};
        int[] b = {1,2,3,4,5,6,7,8,9};
        int n= a.length ;
        n= b.length;
arr(n,n,n,a,b);
}
    }