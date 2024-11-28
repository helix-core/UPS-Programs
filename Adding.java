//Polymorphism - Method Overloading
public class Adding {
    public int num1;
    public int num2;
    public Adding(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int adder(int num1, int num2){
        return num1+num2;
    }
}
class Adding2 {
    public int num1;
    public int num2;
    public int num3;
    public Adding2(int num1,int num2, int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }
    public int adder(int num1, int num2,int num3){
        return num1+num2+num3;
    }
}
class Main{
    public static void main(String[] args) {
        Adding a=new Adding(1, 3);
        System.out.println("The first add:"+a.adder(1,3));
        Adding2 b=new Adding2(2,3,4);
        System.out.println("The second add:"+b.adder(2,3,4));
    }
}
