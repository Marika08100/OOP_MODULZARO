package zoo;

public abstract class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void makeNoise();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
