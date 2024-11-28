import java.util.*;
public class Stacks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stck=new Stack<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            stck.push(sc.nextInt());
        }
        System.out.println("Stack: "+stck);
        
    }

}