import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title, int duration, ArrayList<Actor> listOfActors, Director director, String musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, listOfActors, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
