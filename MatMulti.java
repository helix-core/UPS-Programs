import java.util.*;
public class MatMulti {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat1=new int[n][n];
        int[][] mat2=new int[n][n];
        int[][] res=new int[n][n];
        System.out.println("First Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Second Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Result Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j]=0;
                for(int k=0;k<n;k++){
                    res[i][j]+=mat1[i][k]*mat2[k][j];
                }
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
