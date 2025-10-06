package pl.edu.pwr.student504882.toys;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Toy {
    private String name;
    public abstract void makeSound();

    public Toy (String name){ this.name = name; }
    String getName(){ return this.name; }
    static List<Toy> generateRandomToys(int count) {
        List<Toy> toys = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i<count; i++){
            int randNum = rand.nextInt(5);
            switch (randNum){
                case 0:
                    toys.add(new TeddyBear("Bob"));
                    break;
                case 1:
                    toys.add(new Doll("Liza"));
                    break;
                case 2:
                    toys.add(new Vehicle("Audi"));
                    break;
                case 3:
                    toys.add(new Plane("Boeing 747"));
                    break;
                case 4:
                    toys.add(new Train("IC Kossak"));
                    break;

            }
        }
        return toys;
    }
}
