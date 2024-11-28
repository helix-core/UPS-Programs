import java.util.*;
public class TwoDim {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                if(i==j){
                    arr[i][j]=0;
                }else if(i+j==n-1){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
        
}