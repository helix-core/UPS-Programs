import java.util.*;
public class GCDRec {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(findGCD(num1,num2));
    }
    public static int findGCD(int num1, int num2){
        if(num2==0){
            return num1;
        }else{
            return(findGCD(num2,num1%num2));
        }
    }
}