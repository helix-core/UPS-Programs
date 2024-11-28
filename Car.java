//Basic Class and Encapsulation
public class Car{
    String brand;
    String model;
    int year;
    String color;

    public Car(String brand,String model,int year,String color){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public String toPrint(){
        return("Hello, my car brand is "+ this.getBrand()+ "\nThe model and year are "+ this.getModel()+","+this.getYear()+"\nThe color of the car is "+this.getColor());
    }

    public static void main(String[] args){
        Car Kia= new Car("Kia","X8",2024,"Red");
        System.out.println(Kia.toPrint());
    }
}