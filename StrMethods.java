import java.util.*;
public class StrMethods {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println();
        StringBuilder sb=new StringBuilder(str);

        System.out.println("Enter a string 2: ");
        String str1=sc.nextLine();
        System.out.println();
        StringBuilder ss=new StringBuilder(str1);
        
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.equals(ss));
        System.out.println(str.concat(str1));
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(sb.substring(0,6));
    }
}
