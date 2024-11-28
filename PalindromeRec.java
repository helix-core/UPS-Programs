import java.util.*;
public class PalindromeRec {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();  
        System.out.println(isPal(str,0,str.length()-1));
    }
    public static boolean isPal(String str,int s,int e){
        if(s>=e){
            return true;
        }
        if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        return isPal(str,s+1,e-1);
    }
}