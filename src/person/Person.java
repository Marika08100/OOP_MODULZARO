package person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private int age;
    private final Gender gender;

    private List<String> hobbies;
    private final List<Person> friends;
    private static int population = 0;

    public Person(String name, int age, Gender gender, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = hobbies;
        this.friends = new ArrayList<>();
        population++;
    }

    public void addFriends(Person friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            friend.friends.add(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {

        this.hobbies = hobbies;
    }

    public String getGenderValue() {
        return gender.getEnglishValue();
    }

    public String getHungarianGenderValue() {
        return gender.getHungarianValue();
    }

    public List<Person> getFriends() {
        return friends;
    }

    public static int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        StringBuilder friendNames = new StringBuilder();
        for (Person friend : friends) {
            if (friendNames.length() > 0) {
                friendNames.append(", ");
            }
            friendNames.append(friend.getName());
        }

        return "Name: " + name + ", Age: " + age + ", Gender: " + gender +
                ", Hobbies: " + hobbies + ", Friends: " + friendNames;
    }
}

