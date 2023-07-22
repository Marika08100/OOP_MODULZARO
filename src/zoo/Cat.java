package zoo;

public class Cat extends Mammal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Miauuuuu");
        
    }
}
