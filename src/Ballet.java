import java.util.ArrayList;

public class Ballet extends MusicalShow{
    protected Person choreographer;

    public Ballet(String title, int duration, ArrayList<Actor> listOfActors, Director director, Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(title, duration, listOfActors, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
