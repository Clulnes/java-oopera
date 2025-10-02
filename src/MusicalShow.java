import java.util.ArrayList;

public class MusicalShow extends Show{
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, ArrayList<Actor> listOfActors, Director director, String musicAuthor,
                       String librettoText) {
        super(title, duration, listOfActors, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    @Override
    public String getLibrettoText() {
        return this.librettoText;
    }
}
