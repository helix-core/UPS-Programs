import java.util.*;
public class RevStr {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    StringBuilder sb=new StringBuilder(str);
    System.out.println("The string is: "+sb.toString());
    System.out.println("The reversed string is: "+sb.reverse());
    sc.close();}
}
