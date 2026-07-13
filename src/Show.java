import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration; // длительность в минутах
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printDirector() {
        System.out.println("Режисёр спектакля '" + title + "' - " + this.director.toString());
    }

    public void printListOfActors() {
        System.out.println("Актёры спектакля '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor (Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр " + actor + " уже есть в списке актёров спектакля '" + title + "'!");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor (Actor newActor, String oldActorSurname) {
        boolean actorNotFound = true;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(oldActorSurname)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                actorNotFound = false;
                break;
            }
        }
        if (actorNotFound) {
            System.out.println("Актёра с фамилией " + oldActorSurname + " нет в списке актёров спектакля '" + title + "'!");
        }
    }
}
