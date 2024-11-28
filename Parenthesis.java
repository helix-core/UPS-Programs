import java.util.*;
public class Parenthesis {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> stck=new Stack<Character>();
        boolean flag=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                stck.push(str.charAt(i));
            }
            else{
                char c=stck.pop();
                if(c=='{'&& str.charAt(i)=='}'){
                    flag=true;
                }
                else if(c=='[' && str.charAt(i)==']'){
                    flag=true;
                }
                else if(c=='(' && str.charAt(i)==')'){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}