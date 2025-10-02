public class Person {
    private String name;
    private String surname;
    private int height;
    private Gender gender;

    public Person(String name, String surname, int height, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.gender = gender;
    }

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public enum Gender {
        MALE,
        FEMALE
    }
}
