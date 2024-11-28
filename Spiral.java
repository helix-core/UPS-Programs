import java.util.*;
public class Spiral {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int top=0;
        int right=n-1;
        int bot=n-1;
        int left=0;
        while(top<=bot && left<=right){ 
            for(int j=0;j<n;j++){
                System.out.print(arr[top][j]+" ");
            }
            top++;
            for(int j=0;j<n;j++){
                System.out.print(arr[j][right]+" ");
            }
            right--;
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[bot][j]+" ");
            }
            bot--;
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j][left]+" ");
            }
            left++;
        }
    }
}