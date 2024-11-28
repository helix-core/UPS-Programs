import java.util.*;
public class MergeMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('a',1);
        map.put('b',1);
        map.put('c',4);
        map.put('d',7);
        Map<Character,Integer> map2=new HashMap<Character,Integer>();
        map2.put('a',2);
        map2.put('b',3);
        map2.put('e',4);
        map2.put('f',7);
        for(Map.Entry<Character,Integer> i:map2.entrySet()){
            if(map.containsKey(i.getKey())){
                int newval=map.get(i.getKey());
                map.put(i.getKey(),i.getValue()+newval);
            }
            else{
                map.put(i.getKey(),i.getValue());
            }
        }
        TreeMap<Character, Integer> treeMap = new TreeMap<>(map);
        for(Map.Entry<Character,Integer> i:treeMap.entrySet()){
            System.out.println("Key: "+i.getKey()+" "+"Value: "+i.getValue());
        }
    }
}