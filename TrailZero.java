import java.util.*;
public class TrailZero{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')
                count++;
            else
                break;
        }
        StringBuilder sb=new StringBuilder(str);
        sb.replace(0,count,"");
        System.out.println("The number without trailing zeros:");
        System.out.println(sb.toString());
        sc.close();
    }
}
