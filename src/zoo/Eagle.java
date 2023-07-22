package zoo;

public class Eagle extends Birds{
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Krrrrrr");

    }
}
