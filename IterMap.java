import java.util.*;
public class IterMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,1);
        map.put(3,4);
        map.put(4,7);
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            System.out.println("Key: "+i.getKey()+" "+"Value: "+i.getValue());
        }
    }
}