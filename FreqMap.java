import java.util.*;
public class FreqMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> i:map.entrySet()){
            System.out.println("Key: "+i.getKey()+" "+"Value: "+i.getValue());
        }
    }
}