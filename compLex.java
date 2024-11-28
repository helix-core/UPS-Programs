import java.util.*;
public class compLex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int diff=str1.compareTo(str2);
        if(diff<0){
            System.out.println("String 1 is lexicographically smaller");
        }
        else if(diff>0){
            System.out.println("String 2 is lexicographically smaller");
        }
        else{
            System.out.println("String 1 is lexicographically equal to String 2");
        }
        sc.close();
    }
}
