import java.util.*;
public class RevList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> lst=new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(5);
        Collections.reverse(lst);
        System.out.println(lst);
    }
}
