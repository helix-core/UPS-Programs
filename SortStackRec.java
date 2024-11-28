import java.util.*;
public class SortStackRec {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stck=new Stack<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            stck.push(sc.nextInt());
        }
        System.out.println("Stack before sort: "+stck);
        sortStack(stck);
        System.out.println("Stack after sort: "+stck);
        
    }
    public static void sortInsert(Stack<Integer> stck,int val){
        if(stck.isEmpty() || val>stck.peek()){
            stck.push(val);
            return;
        }
        int temp=stck.pop();
        sortInsert(stck,val);
        stck.push(temp);
    }
    public static void sortStack(Stack<Integer> stck){
        if(!stck.isEmpty()){
            int temp=stck.pop();
            sortStack(stck);
            sortInsert(stck,temp);
        }
    }
}