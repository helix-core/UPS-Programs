import java.util.*;
public class MergeArraySort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int l=n+m;
        int[] arr3=new int[l];
        for(int i=0;i<l;i++){
            if(i<n){
                arr3[i]=arr[i];
            }else{
                arr3[i]=arr2[i-n];
            }
        }
        System.out.println(Arrays.toString(Sorting(arr3)));
    }
    public static int[] Sorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return(arr);
    }
}