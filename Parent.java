//Polymorphism- Method Overriding
class Parent {
    public void Printing(){
        System.out.println("Printing the parent class!");
    }
}
class Child extends Parent{
    public void Printing(){
        System.out.println("Printing the child class!");
    }
}
class Main{
    public static void main(String[] args){
    Parent p=new Parent();
    p.Printing();
    Child c=new Child();
    c.Printing();
    }
}