//10 Random Prime Numbers
import java.lang.Math;
public class RandomNum {
    public static void main(String[] args){
        int count=0;
        while(count<10){
            int curr=((int)(Math.random()*10));
            if(curr!=0 && checkPrime(curr)==true){
                System.out.print(curr+" ");
                count++;
            }
        }
    }
    public static boolean checkPrime(int p){
        boolean flag=true;
        for(int i=2;i<=p/2;i++){
            if(p%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
