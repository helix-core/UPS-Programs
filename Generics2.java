import java.util.*;
public class Generics2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> lst=new ArrayList<>();
        System.out.println("Enter size of list: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of list: ");
        for(int i=0;i<n;i++){
            lst.add(sc.nextInt());
        }
        System.out.println("Your list: "+lst);
        checkList(lst);
    }
    public static <T extends Number> void checkList(List<T> lst){
        int[] sums={0,0};
        lst.forEach((N)->{
            int n = N.intValue();
            if(n%2==0){
                sums[0]+=n;
            }else if(n%2==1){
                sums[1]+=n;
            }
        });
        System.out.println("Odd sum: "+sums[1]);
        System.out.println("Even sum: "+sums[0]);
    }
}
