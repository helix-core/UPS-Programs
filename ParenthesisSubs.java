import java.util.*;
public class ParenthesisSubs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> stck=new Stack<>();
        String S=sc.nextLine();
        for(int i=0;i<S.length();i++){
            String subs=S.substring(i);
            if(checkValid(subs)==true){
                System.out.println(subs.length());
                break;
            }
        }
    }
    public static boolean checkValid(String S){
        Stack<Character> stck=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                stck.push(S.charAt(i));
            }
            else{ if(S.charAt(i)==')'){
                if(stck.size()>0 && stck.peek()=='('){
                    stck.pop();
                }}
            }
        }
        if(stck.size()>0){
            return false;
        }else{
            return true;
        }
    }

}
