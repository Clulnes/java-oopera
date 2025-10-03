import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected ArrayList<Actor> listOfActors;
    protected Director director;


    public Show(String title, int duration, ArrayList<Actor> listOfActors, Director director) {
        this.title = title;
        this.duration = duration;
        this.listOfActors = listOfActors;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void listOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public Director getDirector() {
        return director;
    }

    public void addActor (Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Данный актер уже участвует в спектакле.");
        } else {
            listOfActors.add(actor);
            System.out.println(actor + " добавлен в спектакль: " + title);
        }
    }

    public void replaceActor(String surnameToReplace, Actor replacementActor) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            if (listOfActors.contains(replacementActor)) {
                System.out.println(replacementActor + " уже участвует в спектакле.");
                return;
            }
            listOfActors.set(index, replacementActor);
            System.out.println("Замена произведена успешно!");
        } else {
            System.out.println("Актер с фамилией: " + surnameToReplace + "не найден.");
        }
    }
}
