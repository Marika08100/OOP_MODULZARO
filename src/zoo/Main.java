package zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimals(new Dog("Togo", 6));
        zoo.addAnimals(new Cat("Felix", 1));

        zoo.addAnimals(new Eagle("Talon", 3));
        zoo.addAnimals(new Penguin("Pingu", 30));

        zoo.addAnimals(new Snake("Ebony", 4));
        zoo.addAnimals(new Turtle("Leonardo", 25));
        System.out.println("All animals: ");
        zoo.printAllAnimals();

        System.out.println("\nMammals:");
        zoo.printAllMammals();

        System.out.println("\nBirds:");
        zoo.printAllBirds();

        System.out.println("\nReptiles:");
        zoo.printAllReptiles();
    }
}


