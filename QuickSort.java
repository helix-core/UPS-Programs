import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0;
        int high=n-1;
        quick_sort(arr,low,high);
        System.out.println("Sorted Array:"+Arrays.toString(arr));
        sc.close();
    }
    public static void quick_sort(int arr[],int low,int high){
        if(low<=high) {
            int pivot = partion(arr, low, high);
            quick_sort(arr, low, pivot - 1);
            quick_sort(arr, pivot + 1, high);
        }
    }
    public static int partion(int arr[],int low,int high){
        int pivot = arr[low];
        int start = low;
        int end = high;
        while(start<end) {
            while (start <= high && arr[start] <= pivot) {
                start++;
            }
            while (end >= 0 && arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[end];
        arr[end] = arr[low];
        arr[low] = temp;
        return end;
    }
}
