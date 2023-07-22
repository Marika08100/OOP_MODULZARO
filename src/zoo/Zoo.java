package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimals(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimals(Animal animal) {
        this.animals.remove(animal);
    }

    public void printAllAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " (" + animal.getClass().getSimpleName() + "), age : " + animal.getAge());
        }
    }

    public void printAllMammals() {
        for (Animal animal : animals) {
            if (animal instanceof Mammal) {
                System.out.println(animal.getName() + " (" + animal.getClass().getSimpleName() + "), age : " + animal.getAge());
            }
        }
    }

    public void printAllBirds() {
        for (Animal animal : animals) {
            if (animal instanceof Birds) {
                System.out.println(animal.getName() + " (" + animal.getClass().getSimpleName() + "), age : " + animal.getAge());

            }
        }
    }

    public void printAllReptiles() {
        for (Animal animal : animals) {
            if (animal instanceof Reptile) {
                System.out.println(animal.getName() + " (" + animal.getClass().getSimpleName()+ "), age : " + animal.getAge());

            }
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}
