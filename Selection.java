import java.util.*;
public class Selection {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SelectionSort(arr,n);
        sc.close();
    }
    public static void SelectionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[ind]){
                    ind =j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
