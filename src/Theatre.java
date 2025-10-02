import java.util.ArrayList;
import java.util.Scanner;

public class Theatre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Actor> allActors = new ArrayList<>();
        Actor actor1 = new Actor("Валерий", "Жмышенко", 152, Person.Gender.MALE);
        Actor actor2 = new Actor("Максим", "Пышненко", 187, Person.Gender.MALE);
        Actor actor3 = new Actor("Алексей", "Рыжов", 175, Person.Gender.MALE);
        allActors.add(actor1);
        allActors.add(actor2);
        allActors.add(actor3);
        Director director1 = new Director("Александр", "Дзюба", Person.Gender.MALE, 7);
        Director director2 = new Director("Юлия", "Сопина", Person.Gender.FEMALE, 2);

        ArrayList<Actor> listForSweetPeach = new ArrayList<>();
        ArrayList<Actor> listForDonJuan = new ArrayList<>();
        ArrayList<Actor> listForSwanLake = new ArrayList<>();
        listForSweetPeach.add(actor1);
        listForSweetPeach.add(actor2);
        listForSweetPeach.add(actor3);
        listForDonJuan.add(actor1);
        listForSwanLake.add(actor2);
        listForSwanLake.add(actor3);

        Show show = new Show("Сладкий персик", 50, listForSweetPeach, director1);
        Opera opera = new Opera("Дон Жуан", 210, listForDonJuan, director1, "Моцарт",
                "Дон-Жуан в поисках любовных приключений проникает в дом донны Анны", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 83, listForSwanLake, director2, "Чайковский",
                "Либретто балета «Лебединое озеро» повествует о принце Зигфриде, " +
                        "который влюбляется в Одетту, заколдованную злым колдуном Ротбартом и превращенную в лебедя.",
                "Вацлав Резингер");

        ArrayList<Show> allShows = new ArrayList<>();
        allShows.add(show);
        allShows.add(opera);
        allShows.add(ballet);

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            scanner.nextLine();
            if (command == 1) {
                for (Actor actor : allActors) {
                    System.out.println(actor);
                }
            } else if (command == 2) {
                System.out.println("Либретто какого спектакля вы хотите видеть?");
                String nameOfShow = scanner.nextLine();
                boolean test = false;

                for (Show showOfList : allShows) {
                    if (showOfList.getTitle().equals(nameOfShow)) {
                        System.out.println("Либретто: " + showOfList.getLibrettoText());
                        test = true;
                        break;
                    }
                }

                if (!test) {
                    System.out.println("Такого спектакля нет!");
                }
            } else if (command == 3) {
                System.out.println("Информацию режиссёра какого спектакля необходимо показать?");
                String nameOfShow = scanner.nextLine();
                boolean test = false;

                for (Show showOfList : allShows) {
                    if (showOfList.getTitle().equals(nameOfShow)) {
                        System.out.println(showOfList.getDirector());
                        test = true;
                        break;
                    }
                }

                if (!test) {
                    System.out.println("Такого спектакля нет!");
                }
            } else if (command == 4) {
                System.out.println("Актеров какого спектакля необходимо вывести?");
                String nameOfShow = scanner.nextLine();
                boolean test = false;

                for (Show showOfList : allShows) {
                    if (showOfList.getTitle().equals(nameOfShow)) {
                        System.out.println(showOfList.getListOfActors());
                        test = true;
                        break;
                    }
                }

                if(!test) {
                    System.out.println("Такого спектакля нет!");
                }
            } else if (command == 5) {
                System.out.println("В какой спектакль вы хотите добавить актера?");
                String nameOfShow = scanner.nextLine();
                boolean test = false;

                for (Show showOfList : allShows) {
                    if (showOfList.getTitle().equals(nameOfShow)) {
                        System.out.println("Какого актера вы хотите добавить?(Введите только Фамилию)");
                        String actor = scanner.nextLine();
                        Actor findActor = findActorBySurname(allActors, actor);
                        if (findActor != null) {
                            showOfList.addActor(findActor);
                        }
                        test = true;
                        break;
                    }
                }

                if (!test) {
                    System.out.println("Такого спектакля нет!");
                }
            } else if (command == 6) {
                System.out.println("В каком спектакле вы хотите заменить актера?");
                String nameOfShow = scanner.nextLine();
                boolean test = false;

                for (Show showOfList : allShows) {
                    if (showOfList.getTitle().equals(nameOfShow)) {
                        System.out.println("Какого актера вы хотите заменить?(Введите только Фамилию)");
                        String actorToChange = scanner.nextLine();
                        System.out.println("На какого актера вы хотите его заменить?(Введите только фамилию)");
                        String actorToReplace = scanner.nextLine();
                        Actor actorReplace = findActorBySurname(allActors, actorToReplace);

                        if (actorReplace != null) {
                            showOfList.replaceActor(actorToChange, actorReplace);
                        }
                        test = true;
                        break;
                    }
                }
                if (!test) {
                    System.out.println("Такого спектакля нет!");
                }
            } else if (command == 7) {
                System.out.println("Приятного времяпрепровождения!)");
                break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Вывести на экран список всех актеров театра.");
        System.out.println("2. Распечатать текст либретто.");
        System.out.println("3. Распечатать информацию о режиссёре спектакля.");
        System.out.println("4. Вывести на экран список актеров спектакля.");
        System.out.println("5. Добавить нового актера в спектакль.");
        System.out.println("6. Заменить одного актера спектакля на другого.");
        System.out.println("7. Выход.");
    }

    private static Actor findActorBySurname(ArrayList<Actor> actors, String surname) {
        for (Actor actor : actors) {
            if (actor.getSurname().equals(surname)) {
                return actor;
            }
        }
        System.out.println("Такого актера нет в театре.");
        return null;
    }

}
