import java.util.*;
public class SecondLarge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> lst=new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(5);
        lst.add(4);
        Set<Integer> sets=new HashSet<Integer>(lst);
        ArrayList<Integer> lst2=new ArrayList<Integer>(sets);
        Collections.sort(lst2);
        int n=lst2.size();
        System.out.println(lst2.get(n-2));
    }
}