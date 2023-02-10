package circus;

import circus.animal.*;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Number of animals: " + animals.length);
        makeAnimalsTalk();
        System.out.println("Total value of animals " + calculateAssetValue(animals));
        System.out.println("Total value of equipments " + calculateAssetValue(equipments));

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        Duck louie = new Duck("Louie");
        animalArrayList.add(louie);
        Parrot andy = new Parrot("Andy");
        animalArrayList.add(andy);
        Elephant strongOne = new Elephant("StrongOne");
        animalArrayList.add(strongOne);
        printAllAnimal(animalArrayList);
        System.out.println("Number of animals: " + animalArrayList.size());
        System.out.println("Louie is at : " + animalArrayList.indexOf(louie) + 1);

        animalArrayList.sort(Animal.AnimalNameComparator);
        printAllAnimal(animalArrayList);
        
    }

    private static void printAllAnimal(ArrayList<Animal> animalArrayList) {
        for (Animal a: animalArrayList) {
            System.out.println(a);
        }
    }
}
