import java.util.*;
public class MissingPos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]>0 && arr[i]+1!=arr[i+1]){
                System.out.print(arr[i]+1);
                break;
            }
        }
    }
}


