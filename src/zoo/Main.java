package zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimals(new Dog("Buksi", 6));
        zoo.addAnimals(new Cat("Cirmi", 1));

        zoo.addAnimals(new Eagle("Örn", 3));
        zoo.addAnimals(new Penguin("Pingu", 30));

        zoo.addAnimals(new Snake("Kígyiiii", 4));
        zoo.addAnimals(new Turtle("Torti", 25));
        System.out.println("Összes állat:");
        zoo.printAllAnimals();

        System.out.println("\nEmlősök:");
        zoo.printAllMammals();

        System.out.println("\nMadarak:");
        zoo.printAllBirds();

        System.out.println("\nHüllők:");
        zoo.printAllReptiles();
    }
}


