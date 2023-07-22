package zoo;

public class Turtle extends Reptile{
    public Turtle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Cssscscscs");
    }
}
