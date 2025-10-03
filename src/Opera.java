import java.util.ArrayList;

public class Opera extends MusicalShow{
    protected int choirSize;

    public Opera(String title, int duration, ArrayList<Actor> listOfActors, Director director, Person musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, listOfActors, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
