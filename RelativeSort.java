import java.util.*;
public class RelativeSort {
    public static void relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    result.add(arr1[j]);
                    arr1[j] = -1;
                }
            }
        }
        
        Arrays.sort(arr1);
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                result.add(arr1[i]);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        System.out.println("Enter first array");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter second array");
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        relativeSortArray(arr1,arr2);
        sc.close();
    }
}
