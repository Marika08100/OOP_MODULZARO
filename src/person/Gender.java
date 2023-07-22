package person;

public enum Gender {
    MALE("Male", "Férfi"),
    FEMALE("Female", "Nő");
    private final String englishValue;
    private final String hungarianValue;

    Gender(String englishValue, String hungarianValue) {
        this.englishValue = englishValue;
        this.hungarianValue = hungarianValue;

    }

    public String getEnglishValue() {
        return englishValue;
    }

    public String getHungarianValue() {
        return hungarianValue;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "englishValue='" + englishValue + '\'' +
                ", hungarianValue='" + hungarianValue + '\'' +
                '}';
    }
}
