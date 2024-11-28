import java.util.*;
public class SumOfDig {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(findSum(num));
    }
    public static int findSum(int num){
        int sums=0;
        sums+=num%10;
        num=num/10;
        if(num>0){
            sums+=findSum(num);
        }
        return sums;
    }
}