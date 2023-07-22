package zoo;

public abstract class Birds extends Animal implements Flyable,Oviparous{
    public Birds(String name, int age) {
        super(name, age);
    }
}
