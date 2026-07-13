import java.util.ArrayList;

public class Show {
    private String title;
    private int duration; // длительность в минутах
    private Director director;
    private ArrayList<Actor> listOfActors;

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
        System.out.println("Режисёр спектакля '" + title + "' - " + this.director);
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
            // System.out.println("Актёр " + actor + " добавлен");
        }
    }

    public void replaceActor (Actor oldActor, Actor newActor) {
        if (listOfActors.contains(oldActor)) {
            listOfActors.remove(oldActor);
            listOfActors.add(newActor);
            // System.out.println("Актёр " + oldActor + " заменён на " + newActor);
        } else {
            System.out.println("Актёра " + oldActor + " нет в списке актёров спектакля '" + title + "'!");
        }
    }
}
