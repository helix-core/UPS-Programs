import java.util.*;
public class Intersection {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> lst=new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(2);
        ArrayList<Integer> lst2=new ArrayList<Integer>();
        lst2.add(1);
        lst2.add(1);
        lst2.add(4);
        lst2.add(6);
        lst2.add(3);
        Set<Integer> sets=new HashSet<Integer>(lst);
        Set<Integer> sets2=new HashSet<Integer>(lst2);
        for(Integer i:sets){
            if(sets2.contains(i)){
                System.out.println(i+" ");
            }
        }
    }
}