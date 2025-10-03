import java.util.Objects;

public class Actor extends Person{
    protected int height;
    public Actor (String name, String surname, int height, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актёр: " + getName() + " " + getSurname() + " (" + getHeight() + " см)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor otherActor = (Actor) o;
        return getHeight() == otherActor.getHeight() && Objects.equals(getName(), otherActor.getName()) &&
                Objects.equals(getSurname(), otherActor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getHeight());
    }

    public int getHeight() {
        return height;
    }
}
