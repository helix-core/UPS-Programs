import java.util.*;
public class CheckVow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        char strs[]=str.toCharArray();
        String vow="aeiou";
        int count=0;
        for(char a:strs){
            if(vow.contains(String.valueOf(Character.toLowerCase(a)))){
                count++;
            }
        }
        System.out.println(count);
    }
}

