package zoo;

public class Penguin extends Birds{
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Ööööööö");

    }
}
