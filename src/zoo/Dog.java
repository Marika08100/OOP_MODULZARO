package zoo;

public class Dog extends Mammal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Vauu - vau");

    }
}
