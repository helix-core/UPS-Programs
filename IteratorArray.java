import java.util.*;
public class IteratorArray {
    public static void main(String[] args){
        ArrayList<Integer> lst=new ArrayList<Integer>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(5);
        Iterator<Integer> itr=lst.iterator(); 
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
