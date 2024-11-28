import java.util.*;
public class MinStack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stck=new Stack<Integer>();
        Stack<Integer> mini=new Stack<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int curr=sc.nextInt();
            stck.push(curr);
            if(mini.isEmpty() || curr<mini.peek()){
                mini.push(curr);
                stck.pop();
            }
        }
        System.out.println("Minimum element is : "+ mini.peek());
        System.out.println("The original stack: "+stck);
    }
}