import java.util.*;
public class ArrayList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr =new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("The ArrayList is : "+arr);
    }
}
