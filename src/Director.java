public class Director extends Person{
    protected int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void directorInformation() {
        System.out.println("Режиссёр: " + getName() + " " + getSurname());
    }
}
