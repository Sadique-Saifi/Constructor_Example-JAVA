Write a java program named car
The car class should have the following attributes : make(string), Model(string), year(int), and price (int)
The car class should have a constructor that takes all the attributes
Add a main method to instantiate car objects
The program should allow the user to create and display objects of each car class

Java Code-

Car Program
public class Car {
    String make;
    String model;
    short year;
    int price;

    Car( String make, String model, short year, int price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    void display(){
        System.out.println("make= "+make);
        System.out.println("model= "+model);
        System.out.println("year ="+year);
        System.out.println("price=$ "+price);
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Land Rover", "Velar", (short) 2024, 8000000);
        Car car2 = new Car("Tata Safari", "MT Base Variant", (short) 2023, 2300000);

        System.out.println("Car1  :");
        car1.display();
        System.out.println("Car2 :");
        car2.display();
    }
}
