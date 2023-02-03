package circus;

import circus.animals.Animal;
import circus.animals.Bird;
import circus.animals.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck duck = new Duck();
        getToSpeak(duck);

        Bird bird = (Bird) duck;  // upcasting
        getToSpeak(bird);

        Animal animal = (Animal) bird; // upcasting
        getToSpeak(animal);

        Duck duck2 = (Duck) animal; // downcasting
        getToSpeak(duck2);

        train(new Duck());
        // train(new circus.animals.Parrot());

//        circus.animals.Animal animal2 = new circus.animals.Animal();
        Bird bird2 = new Bird();
        //shift+f6 to modify variable names

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("not a duck");
        }
    }
}
