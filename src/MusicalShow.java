import java.util.ArrayList;

public class MusicalShow extends Show{
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, ArrayList<Actor> listOfActors, Director director, Person musicAuthor,
                       String librettoText) {
        super(title, duration, listOfActors, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
