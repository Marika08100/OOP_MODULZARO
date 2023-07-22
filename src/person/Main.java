package person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", 30, Gender.MALE, List.of("reading", "swimming"));
        Person mary = new Person("Mary", 25, Gender.FEMALE, List.of("painting", "dancing"));
        Person katy = new Person("Katy",26,Gender.FEMALE,List.of("riding"));


        System.out.println(john);
        System.out.println(mary);
        System.out.println(katy);

        john.addFriends(mary);
        john.addFriends(katy);

        System.out.println("John's friends: " + john.getFriends());
        System.out.println("Mary's friends: " + mary.getFriends());
        System.out.println("Katy's friends: " + katy.getFriends());

        System.out.println("Population: " + Person.getPopulation());
    }
}

