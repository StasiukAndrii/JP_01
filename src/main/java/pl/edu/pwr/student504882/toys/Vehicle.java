package pl.edu.pwr.student504882.toys;

public class Vehicle extends Toy{

    public Vehicle(String name){ super(name); }
    public void makeSound(){
        System.out.println("Vroom!");
    }
}
