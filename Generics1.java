import java.util.*;
public class Generics1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arr1=new Integer[n];
        Integer[] arr2=new Integer[n];
        System.out.println("Array 1 elements:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Array 2 elements:");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(checkArr(arr1,arr2));
    }
    public static <T> boolean checkArr(T[] arr1,T[] arr2){
        int N = arr1.length;
        int M = arr2.length;

        if (N != M)
            return false;

        for (int i = 0; i < N; i++)
            if (!arr1[i].equals(arr2[i]))
                return false;
        return true;
    }
}
