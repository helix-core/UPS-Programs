import java.util.*;
public class RemDup {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> lst=new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(5);
        lst.add(2);
        Set<Integer> sets=new HashSet<Integer>(lst);
        System.out.println(sets);
    }
}