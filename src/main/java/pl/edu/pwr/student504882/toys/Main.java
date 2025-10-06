package pl.edu.pwr.student504882.toys;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Toy> randomToys = Toy.generateRandomToys(10);
        for(Toy toy: randomToys){
            System.out.printf(toy.getName()+" says: ");
            toy.makeSound();
        }
    }
}