package zoo;

public class Snake extends Reptile{
    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Sssssssssssz");

    }
}
