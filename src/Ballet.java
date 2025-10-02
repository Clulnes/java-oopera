import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private String choreographer;

    public Ballet(String title, int duration, ArrayList<Actor> listOfActors, Director director, String musicAuthor,
                  String librettoText, String choreographer) {
        super(title, duration, listOfActors, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
